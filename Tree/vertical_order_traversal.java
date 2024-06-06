//https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/

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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(0,root));

        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            if(map.containsKey(cur.hd))
            {
                map.get(cur.hd).add(cur.node.val);
            }
            else
            {
                ArrayList list = new ArrayList<>();
                list.add(cur.node.val);
                map.put(cur.hd, list);
            }

            if(cur.node.left!=null)
            {
                q.offer(new Pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null)
            {
                q.offer(new Pair(cur.hd+1,cur.node.right));
            }
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet())
        {
            res.add(entry.getValue());
        }

        return res;
    }

    class Pair{
        int hd;
        TreeNode node;

        public Pair(int hd, TreeNode node)
        {
            this.hd = hd;
            this.node = node;
        }
    }
}
