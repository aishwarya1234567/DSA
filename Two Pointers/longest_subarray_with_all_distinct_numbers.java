//https://docs.google.com/document/d/1Utku2AUwPW4iiXhQDi-MUzMpyNm_78VCCWec55g2cas/edit
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
		int len=-1,i=0,j=0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		while(j<n)
		{
		    if(!hm.containsKey(arr[j]))
		    {
		        len = Math.max(len, j-i+1);
		    }
		    else
		    {
		        int id=hm.get(arr[j]);
		        while(i<=id)
		        {
		            hm.remove(arr[i]);
		            i++;
		        }
		        i=id+1;
		    }
		    hm.put(arr[j],j);
		    j++;
		}
		
		System.out.println(len);
	}
}
