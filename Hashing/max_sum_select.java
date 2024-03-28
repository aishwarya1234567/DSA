//https://www.desiqna.in/16087/media-net-oa-sde1-ctc-28-l

import java.util.*;
import java.io.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] suf = new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        suf[n] = 0;
        suf[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=a[i]+suf[i+1];
        }
        
        int max = suf[n-k];
        int pre = 0;
        
        for(int i=0;i<k;i++)
        {
            pre+=a[i];
            max = Math.max(max, pre+suf[n-k+(i+1)]);
        }
        
        System.out.println("Max:"+max);
    }
}