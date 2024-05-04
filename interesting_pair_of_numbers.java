//https://www.desiqna.in/17097/de-shaw-oa-sde-coding-questions-2024-set-69

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
	    int t = sc.nextInt();
	    if(t%2!=0)
	    {
	        System.out.println(-1);
	    }
	    else
	    {
	        int c1=0,c2=0;
	        for(int i=0;i<n;i++)
    	    {
    	        if(arr[i]==t/2)
    	        {
    	            c1++;
    	        }
    	        else if(arr[i]<t/2)
    	        {
    	            c2++;
    	        }
    	    }
    	    int res = c1*c2+(c1*(c1-1)/2);
    	    System.out.println(res);
	    }
	}
}
