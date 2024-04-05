//https://docs.google.com/document/d/1HwqRB-dQZXKlHlpn-2KLqyrWDbYEZ4gD7uskSEQUUcM/edit

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int req = k-a[i];
            if(hm.containsKey(req))
            {
                len = Math.min(len, i-hm.get(req)+1);
            }
            hm.put(a[i], i);
        }
        
        System.out.println(len);
	}
}