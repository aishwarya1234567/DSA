//https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=youtube&utm_medium=affiliate&utm_campaign=codestudio_Striver_BinarySeries&leftPanelTabValue=SUBMISSION

public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low=0,high=n-1,ans=n;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>x)
            {
                ans = mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
