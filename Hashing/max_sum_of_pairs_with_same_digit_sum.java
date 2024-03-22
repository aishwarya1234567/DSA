//https://www.desiqna.in/13267/microsoft-coding-oa-sde-1-may-3-2023

import java.io.*;
import java.util.*;

public class MyClass {
    public static int digitsum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		int max=-1;
		
		for(int num : arr)
		{
		    int sum = digitsum(num);
		    if(hm.containsKey(sum))
		    {
		        int res = num+hm.get(sum);
		        max=Math.max(res, max);
		        hm.put(sum, Math.max(hm.get(sum), num));
		    }
		    else
		    {
		        hm.put(sum, num);
		    }
		}
		System.out.println("Max is : " + max);
    }
}
