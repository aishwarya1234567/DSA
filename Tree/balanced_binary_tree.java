/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//O(N)
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        return height(root)>=1;
    }

    public int height(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int left = height(node.left);
        if(left == -1)
        {
            return -1;
        }
        int right = height(node.right);
        if(right == -1)
        {
            return -1;
        }
        if(Math.abs(left-right)>1)
        {
            return -1;
        }

        return (Math.max(left,right)+1);
    }
}

//O(N*N)
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        
        int left = height(root.left);
        int right = height(root.right);
        int ans = Math.abs(left-right);

        return (ans<=1) && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }

        return (Math.max(height(node.left),height(node.right))+1);
    }
}
