//https://docs.google.com/document/d/1LthiOPD4CvHTu9d0_h_XKJF9U9BYdjYYetnjjAPQLpo/edit

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int[] pref = new int[n];
        int[] suf = new int[n];
        
        int j=1;
        pref[0]=0;
        while(j<n)
        {
            int i=0,c=0;
            while(i<=j-1)
            {
                if(a[i]>a[j])
                {
                    c++;
                }
                i++;
            }
            pref[j]=c;
            j++;
        }
        
        int k=n-2;
        suf[n-1]=0;
        while(k>=0)
        {
           int l=k+1,c=0;
           while(l<n)
           {
               if(a[k]>a[l])
               {
                   c++;
               }
               l++;
           }
           suf[k]=c;
           k--;
        }
        int count = 0;
        for(j=0;j<n;j++)
        {
            for(k=j+1;k<n;k++)
            {
                if(a[j]<a[k])
                {
                    count+=pref[j]*suf[k];
                }
            }
        }
        
        System.out.println(count);
	}
}