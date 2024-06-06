//https://www.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
     {
        //add your code here.
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        q.offer(root);
        
        while(!q.isEmpty())
        {
            Node cur = q.poll();
            while(cur!=null)
            {
                q.offer(cur.left);
                res.add(cur.data);
                cur=cur.right;
            }
        }
        
        return res;
     }
}
