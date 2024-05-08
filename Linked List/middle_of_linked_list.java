//https://leetcode.com/problems/middle-of-the-linked-list/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode ptr = head;
        int count = 0;

        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }

        ptr=head;
        int i=0;
        while(i<count/2)
        {
            ptr=ptr.next;
            i++;
        }
        return ptr;
    }
}
