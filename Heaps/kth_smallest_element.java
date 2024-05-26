//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=l;i<=r;i++)
        {
            pq.offer(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    } 
}
