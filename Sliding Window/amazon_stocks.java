/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr={1,2,7,7,4,3,6};
		int k = 3;
		int n = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		int i=0,j=0,max=-1,sum=0;
		
		while(j<n && i<n)
		{
		    sum+=arr[j];
		    
		    hm.put(arr[j], hm.getOrDefault(arr[j],0)+1);
	        if(j-i+1>k)
	        {
	            sum-=arr[i];
	            hm.put(arr[i], hm.getOrDefault(arr[i],0)-1);
	            if(hm.get(arr[i])==0)
	            {
	                hm.remove(arr[i]);
	            }
	            i++;
	        }
	        
	        if(j-i+1==k)
	        {
    	        if(hm.size()==k)
    	        {
    	            max=Math.max(max, sum);
    	        }
	        }
		    j++;
		}
		System.out.println(max);
	}
}
