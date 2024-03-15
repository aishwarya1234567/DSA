//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1204128493/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo=-1,lo=-1,high=nums.length-1,low=0,mid;

        if(nums.length == 0)
        {
            int[] res = new int[2];
            res[0] = fo;
            res[1] = lo;
            return res;
        }

        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid]>target)
            {
                high = mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                fo=mid;
                high=mid-1;
            }
        }

        low = 0;
        high=nums.length-1;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid]>target)
            {
                high = mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                lo=mid;
                low=mid+1;
            }
        }

        int[] res = new int[2];
        res[0] = fo;
        res[1] = lo;

        return res; 
    }   
}