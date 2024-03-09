//https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character, Integer> minFreq = new HashMap<>();

        String first = words[0];

        for(int i=0;i<first.length();i++)
        {
            minFreq.put(first.charAt(i), minFreq.getOrDefault(first.charAt(i), 0) + 1);
        }

        for(int i=1;i<words.length;i++)
        {
            Map<Character, Integer> freq = new HashMap<>();
            String cur = words[i];

            for(int j=0;j<cur.length();j++)
            {
                freq.put(cur.charAt(j), freq.getOrDefault(cur.charAt(j), 0) + 1);
            }

            for(Character key : minFreq.keySet())
            {
                if(freq.containsKey(key))
                {
                    minFreq.put(key, Math.min(freq.get(key), minFreq.get(key)));
                }
                else
                {
                    minFreq.put(key, 0);
                }
            }
        }

        List<String> res = new ArrayList<>();

        for(Character key: minFreq.keySet())
        {
            if(minFreq.get(key) != 0)
            {
                for(int i=0;i<minFreq.get(key);i++)
                    res.add(key + "");
            }
        }

        return res;
    }
}