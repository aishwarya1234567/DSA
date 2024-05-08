//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null || head.next==null)
        {
            return head;
        }
        Node prev = null;
        while(head!=null)
        {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}
