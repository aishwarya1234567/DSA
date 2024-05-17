//https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
        HashMap<Integer, Integer> hm=new HashMap<>();
        Node ptr = head, prev=null;
        while(ptr!=null)
        {
            if(hm.containsKey(ptr.data))
            {
                prev.next=ptr.next;
            }
            else
            {
                hm.put(ptr.data, 1);
                prev=ptr;
            }
            ptr=ptr.next;
        }
        return head;
    }
}
