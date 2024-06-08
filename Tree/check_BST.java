https://www.geeksforgeeks.org/problems/check-for-bst/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        return helper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean helper(Node node, int min, int max)
    {
        if(node == null)
        {
            return true;
        }
        
        if(node.data <= min || node.data >= max)
        {
            return false;
        }
        
        return helper(node.left, min, node.data) && helper(node.right, node.data, max);
    }
}
