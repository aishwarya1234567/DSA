class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
            hm.put(words[i], hm.getOrDefault(words[i], 0)+1);
        }

        int len = 0,flag=0;

        for(String str : hm.keySet())
        {
            char s1 = str.charAt(0);
            char s2 = str.charAt(1);

            if(s1==s2)
            {
                if(hm.get(str)%2 == 0)
                {
                    len += hm.get(str)*2;
                }
                else
                {
                    if(flag==0)
                    {
                        len += hm.get(str)*2;
                        flag=1;
                    }
                    else
                    {
                        len += (hm.get(str)-1)*2;
                    }
                }
            }
            else
            {
                String rev = ""+s2+s1;
                if(hm.containsKey(rev))
                {
                    len += Math.min(hm.get(str), hm.get(rev))*2;
                }
            }
        }

        return len;
    }
}
