//https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> elem = new HashMap<>();
        int max = 0;

        for(int num : nums)
        {
            elem.put(num, false);
        }

        for(int num : nums)
        {
            if(!elem.get(num) && !elem.containsKey(num-1))
            {
                int len = 0, cur = num;
                while(elem.containsKey(cur))
                {
                    len++;
                    elem.put(cur, true);
                    cur++;
                }

                max = Math.max(len, max);
            }
        }

        return max;
    }
}