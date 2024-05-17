//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head, prev=null;
        int data = -101;

        while(ptr!=null)
        {
            if(data==ptr.val)
            {
                prev.next=ptr.next;
            }
            else
            {
                data=ptr.val;
                prev=ptr;
            }
            ptr=ptr.next;
        }
        return head;
    }
}
