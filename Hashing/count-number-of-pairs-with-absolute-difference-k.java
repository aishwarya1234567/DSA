//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            count += hm.getOrDefault(num-k, 0) + hm.getOrDefault(num+k, 0);
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        return count;  
    }
}