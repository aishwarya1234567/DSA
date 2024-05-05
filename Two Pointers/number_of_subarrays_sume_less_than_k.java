import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();
	    int i=0,j=0,sum=0,count=0;
	    while(i<n && j<n)
	    {
	        sum+=arr[j];
	        while(sum>k)
	        {
	            sum-=arr[i];
	            i++;
	        }
	        count+=j-i+1;
	        j++;
	    }
	    System.out.println(count);
	}
}
