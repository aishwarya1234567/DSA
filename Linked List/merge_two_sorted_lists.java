//https://leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }

        ListNode res = new ListNode();
        ListNode head = res;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                res.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else
            {
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            res = res.next;
        }

        while(list1!=null)
        {
            res.next = new ListNode(list1.val);
            list1 = list1.next; 
            res = res.next;
        }
        while(list2!=null)
        {
            res.next = new ListNode(list2.val);
            list2 = list2.next;
            res = res.next;
        }

        return head.next;
    }
}
