//https://www.desiqna.in/check-if-the-given-array-is-subset-of-another-array-hashing-part-4
//https://www.desiqna.in/part-5

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
		int m=sc.nextInt();
		int[] brr = new int[m];
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int i=0;i<m;i++)
		{
		    brr[i] = sc.nextInt();
		    if(!hm.containsKey(brr[i]))
		    {
		        System.out.println("Arr2 is not a subset of Arr1");
		        return;
		    }
		    if(hm.get(brr[i]) == 0)
		    {
		        System.out.println("Arr2 is not a subset of Arr1");
		        return;
		    }
		    
		    hm.put(brr[i], hm.get(brr[i]) - 1);
		}
		System.out.println("Arr2 is a subset of Arr1");
	}
}