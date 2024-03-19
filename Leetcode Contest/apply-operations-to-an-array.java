//https://leetcode.com/contest/weekly-contest-318/problems/apply-operations-to-an-array/

class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        
        int j = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            {
                j=i;
                break;
            }
        }
        
        if(j==-1)
        {
            return nums;
        }
        
        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        
        return nums;
    }
}