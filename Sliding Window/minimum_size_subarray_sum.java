//https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,n=nums.length,sum=0,len=0,min=Integer.MAX_VALUE;
        while(i<n && j<n)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                len = j-i+1;
                min = Math.min(len, min);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
