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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        boolean flip = false;
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size(), i = 0;
            List<Integer> temp = new ArrayList<>();

            while(i<size)
            {
                TreeNode cur = q.poll();
                if(flip)
                {
                    temp.addFirst(cur.val);
                }
                else
                {
                    temp.add(cur.val);
                }
                if(cur.left!=null)
                {
                    q.offer(cur.left);
                }
                if(cur.right!=null)
                {
                    q.offer(cur.right);
                }
                i++;
            }
            res.add(temp);
            flip = !flip;
        }
        return res;
    }
}
