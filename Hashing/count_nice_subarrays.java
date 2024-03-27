//https://leetcode.com/problems/count-number-of-nice-subarrays/description/

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                nums[i] = 0;
            }
            else
            {
                nums[i] = 1;
            }
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0,count = 0;

        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            if(sum==k)
            {
                count++;
            }
            if(hm.containsKey(sum-k))
            {
                count+= hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }

        return count;
    }
}