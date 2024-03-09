class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer, Integer> hm = new HashMap<>();
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(k-arr[i]))
            {
                count+=hm.get(k-arr[i]);
            }
            hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1);
        }
        return count;
    }
}