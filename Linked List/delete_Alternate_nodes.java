//https://www.geeksforgeeks.org/problems/delete-alternate-nodes/1

class Solution {
    
    public void deleteAlternate (Node head){
        //Write your code here
        if(head==null || head.next==null)
        {
            return;
        }
        Node cur=head;
        while(cur!=null && cur.next!=null)
        {
            cur.next=cur.next.next;
            cur=cur.next;
        }
    }
}
