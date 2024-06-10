/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.offer(new Pair(0,root));
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            if(!hm.containsKey(cur.hd))
            {
                hm.put(cur.hd, cur.node.data);
            }
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
    
    static class Pair{
        int hd;
        Node node;
        Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
}
