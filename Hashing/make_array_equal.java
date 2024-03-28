//https://www.desiqna.in/part-6

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
		int max=0;
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
			if(max<hm.get(arr[i]))
			    max=hm.get(arr[i]);
		}
		
		System.out.println("Minimum operations required to make the array equal is : " + (n-max));
		
	}
}