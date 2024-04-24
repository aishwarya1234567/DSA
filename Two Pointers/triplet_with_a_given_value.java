public static boolean find3Numbers(int arr[], int n, int X) 
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
                if(x+arr[l]+arr[r]==X)
                {
                    return true;
                }
                if(x+arr[l]+arr[r]<X)
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
