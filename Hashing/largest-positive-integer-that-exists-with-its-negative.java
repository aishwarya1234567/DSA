//https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int max=-1;
        for(int num:nums)
        {
            hs.add(num);
        }
        for(int num:nums)
        {
            if(hs.contains(-num))
            {
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
