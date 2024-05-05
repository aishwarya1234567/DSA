class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0)
        {
            return 0;
        }
        int n=nums.length;
        int i=0,j=0,count=0,prod=1;
        while(i<n && j<n)
        {
            prod*=nums[j++];
            while(prod>=k && i<j)
            {
                prod/=nums[i++];
            }
            count+=j-i;
        }
        return count;
    }
}
