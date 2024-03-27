//https://www.desiqna.in/13820/google-oa-sde2-jan-2023

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=1;i<=n;i++)
        {
            int val = a[a[a[i]]];
            count+=hm.getOrDefault(val,0);
            
            hm.put(val, hm.getOrDefault(val,0)+1);
        }
        
        System.out.println("Count: "+count);
    }
}