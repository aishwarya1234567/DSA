//https://www.geeksforgeeks.org/problems/count-the-triplets4615/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        for(int i=n-1;i>0;i--)
        {
            int x = arr[i];
            int l = 0, r = i-1;
            
            while(l<r)
            {
                if(arr[l]+arr[r]==x)
                {
                    count++;
                    l++;
                    r--;
                }
                else if(arr[l]+arr[r]<x)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return count;
    }
}
