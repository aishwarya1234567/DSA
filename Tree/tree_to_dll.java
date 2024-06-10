//https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1
//This function should return head to the DLL

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head = null, prev = null;
    Node bToDLL(Node root)
    {
	    //  Your code here	
	    if(root == null)
	    {
	        return root;
	    }
	    bToDLL(root.left);
	    
	    if(head == null)
	    {
	        head = root;
	    }
	    else
	    {
	        prev.right=root;
	        root.left=prev;
	    }
	    prev=root;
	    
	    bToDLL(root.right);
	    return head;
    }
}
