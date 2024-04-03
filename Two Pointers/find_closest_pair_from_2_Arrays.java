//https://www.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int i=0,j=m-1,diff=Integer.MAX_VALUE,l=-1,r=-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(i<n && j>=0)
        {
            int sum = arr[i]+brr[j];
            if(Math.abs(sum-x)<diff)
            {
                l=arr[i];
                r=brr[j];
                diff = Math.min(diff, Math.abs(sum-x));
            }
            
            if(sum<x)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        res.add(l);
        res.add(r);
        
        return res;
    }
}