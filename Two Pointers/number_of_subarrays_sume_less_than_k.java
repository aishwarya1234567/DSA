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
		    arr[i] = sc.nextInt();
		}
		
		int l=0,r=0,sum=arr[0],count=0;
		
		while(l<n && r<n)
		{
		    if(sum<k)
		    {
		        r++;
		        if(r>=l)
		        {
		            count+=r-l;
		        }
		        if(r<n)
		            sum+=arr[r];
		    }
		    else
		    {
		        sum-=arr[l];
		        l++;
		    }
		}
		System.out.println(count);
	}
}
