import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        
		int i=0,j=n-1,diff=Integer.MAX_VALUE,l=-1,r=-1;
        while(i<n && j>=0)
        {
            int sum = a[i]+b[j];
            if(Math.abs(sum-x)<diff && sum<=x)
            {
                l=a[i];
                r=b[j];
                diff = Math.min(diff, Math.abs(sum-x));
            }
            
            if(sum<x)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        System.out.println(l+" "+r);
	}
}