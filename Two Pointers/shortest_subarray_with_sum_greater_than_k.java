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
	    int i=0,j=0,sum=0,len=Integer.MAX_VALUE;
	    
	    while(i<n && j<n)
	    {
	        sum+=arr[j++];
	        while(sum>=k && i<=j)
	        {
	            len=Math.min(len,j-i);
	            sum-=arr[i++];
	        }
	    }
	    System.out.println(len);
	}
}
