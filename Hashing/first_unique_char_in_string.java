//https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==1)
            {
                return i;
            }
        }

        return -1;
    }
}