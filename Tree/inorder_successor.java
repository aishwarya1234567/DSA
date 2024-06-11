//https://www.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1

/*
class Node {
    int data;
    Node left, right,next;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    Node prev = null;
    public void populateNext(Node root){
        //code here
        if(root == null)
        {
            return;
        }
        populateNext(root.left);
        
        if(prev!=null)
        {
            prev.next=root;
        }
        prev=root;
        
        populateNext(root.right);
    }
}
