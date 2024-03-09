//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];
        res[0]=res[1] = -1;

        for(int i=0; i<nums.length; i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                res[0] = i;
                res[1] = hm.get(target-nums[i]);
                return res;
            }
            hm.put(nums[i], i);
        }

        return res;
    }
}