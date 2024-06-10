//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-interview-150
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
class Solution {
    int ans = -1, count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
        {
            return -1;
        }
        inorder(root,k);
        return ans;
    }

    public void inorder(TreeNode node, int k)
    {
        if(node == null)
        {
            return;
        }
        inorder(node.left, k);

        count++;
        if(count == k)
        {
            ans = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
