//https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int i=0,j=0,max=-1;
        char[] str = s.toCharArray();
        int n=str.length;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        while(j<n && i<n)
        {
            hm.put(str[j], hm.getOrDefault(str[j],0)+1);
            if(hm.size()<k)
            {
            }
            else if(hm.size()==k)
            {
                max=Math.max(max, j-i+1);
            }
            else
            {
                while(hm.size()>k)
                {
                    hm.put(str[i], hm.get(str[i])-1);
                    if(hm.get(str[i])==0)
                    {
                        hm.remove(str[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}
