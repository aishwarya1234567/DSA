//https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/

class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int num:nums)
        {
            if(num%2==0)
            {
                count++;
            }
        }
        return count>=2;
    }
}