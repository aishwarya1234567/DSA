//https://www.geeksforgeeks.org/problems/k-distance-from-root/1

class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> ans = new ArrayList<>();
          helper(root,k,ans);
          return ans;
     }
     
     public void helper(Node root, int k, ArrayList ans)
     {
         if(root==null)
         {
             return;
         }
         if(k==0)
         {
             ans.add(root.data);
             return;
         }
         helper(root.left,k-1,ans);
         helper(root.right,k-1,ans);
     }
}
