//https://www.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1

class Solution
{
    int count=0;
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root == null)
        {
            return 0;
        }
        if(root.data>=l && root.data<=h)
        {
            count++;
        }
        getCount(root.left,l,h);
        getCount(root.right,l,h);
        return count;
    }
}
