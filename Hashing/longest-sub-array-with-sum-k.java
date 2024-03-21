class Solution{
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int K) {
        //Complete the function
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0, sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum==K)
            {
                max = Math.max(i+1, max);    
            }
            
            if(hm.containsKey(sum-K))
            {
                max = Math.max(i - hm.get(sum-K), max);
            }
            
            if(!hm.containsKey(sum))
            {
                hm.put(sum, i);
            }
        }
        
        return max;
    }   
}
