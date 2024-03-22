//https://leetcode.com/contest/biweekly-contest-103/problems/find-the-prefix-common-array-of-two-arrays/

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int[] ans = new int[A.length];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==B[i])
            {
                count++;
            }
            else
            {
                if(hm.containsKey(A[i]))
                {
                    count++;
                }
                if(hm.containsKey(B[i]))
                {
                    count++;
                }
            }
            ans[i] = count;
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
            hm.put(B[i], hm.getOrDefault(B[i], 0)+1);
        }
        
        return ans;
    }
}
