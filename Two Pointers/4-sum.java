//https://www.geeksforgeeks.org/find-four-numbers-with-sum-equal-to-given-sum/


class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int l=j+1,r=n-1;
                while(l<r)
                {
                    int sum = arr[i]+arr[j]+arr[l]+arr[r];
                    
                    if(sum == k)
                    {
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[l]);
                        a.add(arr[r]);
                        
                        if(!res.contains(a))
                            res.add(a);
                        l++;
                        r--;
                    }
                    else if(sum < k)
                    {
                        l++;
                    }
                    else
                    {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
