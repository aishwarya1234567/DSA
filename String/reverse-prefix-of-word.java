//https://leetcode.com/problems/reverse-prefix-of-word/?envType=daily-question&envId=2024-05-01

class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        int j=0,i=0;
        while(j<n)
        {
            if(word.charAt(j)==ch)
            {
                break;
            }
            j++;
        }
        if(j==n)
        {
            return word;
        }
        char[] s = word.toCharArray();
        while(i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(s);
    }
}