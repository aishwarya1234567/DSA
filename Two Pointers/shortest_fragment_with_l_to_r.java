//https://www.desiqna.in/16582/microsoft-sde-oa-coding-questions-set-119

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int l = sc.nextInt();
	    int r = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		int i=0,j=0,len=Integer.MAX_VALUE;
		
		while(i<n && j<n)
		{
		    if(arr[j]>=l && arr[j]<=r)
		    {
		        hm.put(arr[j], hm.getOrDefault(arr[j],0)+1);
		    }
		    if(hm.size()==(r-l+1))
		    {
		        len=Math.min(len, j-i+1);
		        if(hm.containsKey(arr[i]))
		        {
		            hm.put(arr[i], hm.get(arr[i])-1);
		            if(hm.get(arr[i])==0)
		            {
		                hm.remove(arr[i]);
		            }
		        }
		        i++;
		        if(hm.containsKey(arr[j]))
		        {
		            hm.put(arr[j], hm.get(arr[j])-1);
		            if(hm.get(arr[j])==0)
		            {
		                hm.remove(arr[j]);
		            }
		        }
		    }
		    else
		    {
		        j++;
		    }
		}
		System.out.println(len);
	}
}
