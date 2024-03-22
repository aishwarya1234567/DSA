//https://www.geeksforgeeks.org/count-number-subarrays-given-xor/

import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int xor=0,count=0;

        for(int num : a)
        {
            xor^=num;
            if(xor==b)
            {
                count++;
            }
            if(hm.containsKey(xor^b))
            {
                count+=hm.get(xor^b);
            }

            hm.put(xor, hm.getOrDefault(xor, 0)+1);
        }

        return count;
    }
}
