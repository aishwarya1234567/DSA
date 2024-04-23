//https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);

        int cur=1;
        for(int i=0;i<n;i++)
        {
            res[i] *= cur;
            cur *= nums[i];
        }
        cur=1;
        for(int i=n-1;i>=0;i--)
        {
            res[i] *= cur;
            cur *= nums[i];
        }
        return res;
    }
}
