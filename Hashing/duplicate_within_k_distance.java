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
		int dist=sc.nextInt();
		int[] arr = new int[n];
		
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(hm.containsKey(arr[i]))
			{
			    if(i - hm.get(arr[i]) <= dist)
			    {
			        System.out.println("Duplicate elements exists within " + dist + " distance");
			        return;
			    }
			}
			hm.put(arr[i], i);
		}
		System.out.println("Duplicate elements doesn't exist within " + dist + " distance");
	}
}