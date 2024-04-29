class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0,r=0,count=0,res=1;
        int n=nums.length;
        while(r<n)
        {
            res*=nums[r++];
            while(res>=k && l<r)
            {
                res/=nums[l++];
            }
            count+=(r-l);
        }
        return count;
    }
}
