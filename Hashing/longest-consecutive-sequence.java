class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> checked = new HashSet<>();
        Set<Integer> elem = new HashSet<>();
        int max = 0;

        for(int num : nums)
        {
            elem.add(num);
        }

        for(int num : nums)
        {
            if(!elem.contains(num-1) && !checked.contains(num))
            {
                int len = 0, cur = num;
                while(elem.contains(cur))
                {
                    len++;
                    checked.add(cur);
                    cur++;
                }

                max = Math.max(len, max);
            }
        }

        return max;
    }
}