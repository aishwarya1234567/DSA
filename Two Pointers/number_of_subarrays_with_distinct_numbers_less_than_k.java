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
	    int i=0,j=0,count=0;
	    HashMap<Integer, Integer> hm = new HashMap<>();
	    
	    while(i<n && j<n)
	    {
	        hm.put(arr[j], hm.getOrDefault(arr[j],0)+1);
	        int d = hm.size();
	        while(d>k)
	        {
	            hm.put(arr[i], hm.getOrDefault(arr[i], 1)-1);
	            if(hm.get(arr[i])==0)
	            {
	                hm.remove(arr[i]);
	            }
	            i++;
	            d=hm.size();
	        }
	        count+=j-i+1;
	        j++;
	    }
	    System.out.println(count);
	}
}
