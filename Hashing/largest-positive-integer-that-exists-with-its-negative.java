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
