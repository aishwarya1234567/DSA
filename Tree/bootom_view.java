//https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

//User function Template for Java

class Solution {
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // add your code
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            hm.put(cur.hd, cur.node.data);
            
            if(cur.node.left != null)
            {
                q.offer(new Pair(cur.hd-1, cur.node.left));
            }
            if(cur.node.right != null)
            {
                q.offer(new Pair(cur.hd+1, cur.node.right));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            res.add(entry.getValue());
        }
        return res;
    }
    
    class Pair{
        int hd;
        Node node;
        Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
}
