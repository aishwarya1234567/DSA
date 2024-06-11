//https://www.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1

class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        HashSet<Integer> hs = new HashSet<>();
        return checkPair(root, target, hs) == true ? 1 : 0;
    }
    public boolean checkPair(Node node, int target, HashSet<Integer> hs)
    {
        if(node == null)
        {
            return false;
        }
        if(hs.contains(target-node.data))
        {
            return true;
        }
        if(!hs.contains(node.data))
        {
            hs.add(node.data);
        }
        
        return checkPair(node.left, target, hs) || checkPair(node.right, target, hs);
    }
}
