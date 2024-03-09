class GfG
{
    int maxLen(int arr[], int n)
    {
        // return longest_length;
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0, sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum==0)
            {
                max = Math.max(i+1, max);    
            }
            
            if(hm.containsKey(sum))
            {
                max = Math.max(i - hm.get(sum), max);
            }
            else
            {
                hm.put(sum, i);
            }
        }
        
        return max;
    }
}