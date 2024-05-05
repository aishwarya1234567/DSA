//https://www.geeksforgeeks.org/count-number-of-substrings-having-at-least-k-distinct-characters/

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    int k = sc.nextInt();
	    int i=0,j=0,count=0;
	    HashMap<Character, Integer> hm = new HashMap<>();
	    char[] s = str.toCharArray();
	    int n=s.length;
	    
	    while(i<n && j<n)
	    {
	        hm.put(s[j],hm.getOrDefault(s[j],0)+1);
	        j++;
	        int d=hm.size();
	        
	        while(d>=k)
	        {
	            hm.put(s[i], hm.getOrDefault(s[i],0)-1);
	            if(hm.get(s[i])==0)
	            {
	                hm.remove(s[i]);
	            }
	            count+=n-j+1;
	            i++;
	            d=hm.size();
	        }
	    }
	    System.out.println(count);
	}
}
