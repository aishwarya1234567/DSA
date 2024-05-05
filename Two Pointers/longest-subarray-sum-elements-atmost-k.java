//https://geeksforgeeks.org/longest-subarray-sum-elements-atmost-k/

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int i=0,j=0,sum=0,len=-1;
	    
	    while(i<n && j<n)
	    {
	        sum+=arr[j++];
	        while(sum>=k && i<=j)
	        {
	            sum-=arr[i++];
	        }
	        len=Math.max(len,j-i);
	    }
	    System.out.println(len);
	}
}
