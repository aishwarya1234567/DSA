//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int n){
        // code here
        long sum = 0, max=-1;
        int i = 0, j = 0;
        
        while(i<n && j<n)
        {
            sum+=Arr.get(j);
            if(j-i+1==k)
            {
                max=Math.max(max, sum);
                sum-=Arr.get(i);
                i++;
            }
            j++;
        }
        return max;
    }
}