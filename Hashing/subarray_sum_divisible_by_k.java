class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(rem == 0)
            {
                count+=1;
            }
            if(hm.containsKey(rem))
            {
                count+=hm.get(rem);
            }
            hm.put(rem, hm.getOrDefault(rem, 0)+1);
        }
        return count;
    }
}
