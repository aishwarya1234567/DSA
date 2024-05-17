//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

class Solution{
    boolean isSubSequence(String A, String B){
        int i=0,j=0;
        
        while(i<A.length() && j<B.length())
        {
            char a = A.charAt(i);
            char b = B.charAt(j);
            if(a==b)
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        
        return (i==A.length());
    }
}
