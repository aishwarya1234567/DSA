//https://www.geeksforgeeks.org/count-pairs-array-whose-sum-less-x/

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int t = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		int i=0,j=n-1,count=0;
		while(i<j)
		{
		    if(arr[i]+arr[j]<t)
		    {
		        count+=j-i;
		        i++;
		    }
		    else
		    {
		        j--;
		    }
		}
		System.out.println(count);
	}
}
