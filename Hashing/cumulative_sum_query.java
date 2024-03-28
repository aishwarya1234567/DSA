//https://www.spoj.com/problems/CSUMQ/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n+1];
		int[] prefixsum = new int[n+1];
		
		arr[0] = 0;
		prefixsum[0] = 0;
		
		for(int i=1;i<=n;i++)
		{
			arr[i] = sc.nextInt();
			prefixsum[i] = prefixsum[i-1] + arr[i];
		}
		int q=sc.nextInt();
		int i=1;
		
		while(i<=q)
		{
    		int l=sc.nextInt();
    		int r=sc.nextInt();
    		i++;
    		
    		System.out.println(prefixsum[r]-prefixsum[l-1]);
		}
	}
}