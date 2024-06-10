//https://leetcode.com/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i=0,j=0,n=s.length(),max=Integer.MIN_VALUE;

        while(i<n && j<n)
        {
            char c = s.charAt(j);
            hm.put(c, hm.getOrDefault(c,0) + 1);

            while(hm.get(c)>1)
            {
                char ch = s.charAt(i);
                hm.put(ch, hm.get(ch)-1);
                if(hm.get(ch)==0)
                {
                    hm.remove(ch);
                }
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max==Integer.MIN_VALUE ? 0 : max;
    }
}
