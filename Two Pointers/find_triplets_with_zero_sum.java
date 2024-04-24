class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    { 
        //Your code here
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            
            while(l<r)
            {
                if(x+arr[l]+arr[r]==0)
                {
                    return true;
                }
                if(x+arr[l]+arr[r]<0)
                {
                    l++;
                }
                else
                {
                    r--;   
                }
            }
        }
        return false;
    }
}
