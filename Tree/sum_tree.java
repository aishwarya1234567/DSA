//https://www.geeksforgeeks.org/problems/sum-tree/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
	boolean isSumTree(Node root)
	{
             // Your code here
        if(root == null)
        {
            return true;
        }
        
        if(root.left == null && root.right == null)
        {
            return true;
        }
        
        boolean l = isSumTree(root.left);
        boolean r = isSumTree(root.right);
        
        int sum = 0;
        
        if(root.left!=null)
        {
            sum+=root.left.data;
        }
        if(root.right!=null)
        {
            sum+=root.right.data;
        }
        
        if(l && r && (sum == root.data))
        {
            root.data*=2;
            return true;
        }
        return false;
	}
}
