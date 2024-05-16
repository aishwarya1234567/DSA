// https://docs.google.com/document/d/1vmrpwgLKcKXejjQoI3G0JoG9iytzLChhQvyT8dZI90Y/edit

/*package whatever //do not write package name here */

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
        
        int m = sc.nextInt();
        int sum=0,max=-1,i=0,j=0,total_sum=0;
        
        while(i<n && j<n)
        {
            total_sum+=a[j];
            sum+=a[j];
            if(j-i+1>=m)
            {
                max=Math.max(sum, max);
                sum-=a[i];
                i++;
            }
            j++;
        }
        
        System.out.println(total_sum-max);
	}
}
