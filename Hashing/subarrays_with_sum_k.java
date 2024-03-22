//https://www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/

class Solution
{
    static int findSubArraySum(int arr[], int N, int k)
    {
        // code here
        int count = 0, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<N; i++)
        {
            sum += arr[i];
            if(sum==k)
            {
                count++;
            }
            
            if(hm.containsKey(sum-k))
            {
                count +=hm.get(sum-k);
            }
            
            hm.put(sum,hm.getOrDefault(sum, 0)+1);
        }
        
        return count;
    }
}
