//https://www.geeksforgeeks.org/count-pairs-given-xor/

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++)
        {
            int xor = a[i]^target;
            if(hm.containsKey(xor))
            {
                count+=hm.get(xor);
            }
            hm.put(a[i], hm.getOrDefault(a[i], 0)+1);
        }
        
        System.out.println(count);
	}
}