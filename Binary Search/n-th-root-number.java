//https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution
{
    public int NthRoot(int n, int m)
    {
        // code here
        int low=1,high=m;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(Math.pow(mid,n) == m)
            {
                return mid;
            }
            else if(Math.pow(mid,n) <m)
            {
                low=mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}