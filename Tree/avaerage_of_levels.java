//https://leetcode.com/problems/average-of-levels-in-binary-tree/?envType=study-plan-v2&envId=top-interview-150
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            double sum= 0;
            for(int i=0;i<size;i++)
            {
                TreeNode cur = q.poll();
                sum += cur.val;
                if(cur.left != null)
                {
                    q.offer(cur.left);
                }
                if(cur.right != null)
                {
                    q.offer(cur.right);
                }
            }
            res.add(sum/size);
        }
        return res;
    }
}
