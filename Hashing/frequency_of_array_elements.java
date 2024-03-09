//https://www.desiqna.in/part-3

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr = new int[n];
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		
		int q=sc.nextInt();
		int i=1;
		
		while(i<=q)
		{
		    int num=sc.nextInt();
    		System.out.println(hm.getOrDefault(num, 0));
    		i++;
		}
	}
}