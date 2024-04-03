//https://leetcode.com/problems/two-sum/description/

class Solution {
    class Pair{
        int idx,val;

        public Pair(int idx, int val)
        {
            this.idx = idx;
            this.val = val;
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Pair[] pairs = new Pair[n];

        for(int i=0;i<n;i++)
        {
            pairs[i] = new Pair(i, nums[i]);
        }

        Arrays.sort(pairs, Comparator.comparingInt(o->o.val));

        int i=0,j=n-1;
        while(i<j)
        {
            int sum = pairs[i].val+pairs[j].val;
            if(sum == target)
            {
                return new int[] {pairs[i].idx,pairs[j].idx};
            }
            else if(sum < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}