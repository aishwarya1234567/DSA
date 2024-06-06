//https://www.geeksforgeeks.org/problems/level-order-traversal/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        q.offer(root);
        while(!q.isEmpty())
        {
            Node cur=q.poll();
            res.add(cur.data);
            if(cur.left != null)
            {
                q.offer(cur.left);
            }
            if(cur.right != null)
            {
                q.offer(cur.right);
            }
        }
        return res;
    }
}
