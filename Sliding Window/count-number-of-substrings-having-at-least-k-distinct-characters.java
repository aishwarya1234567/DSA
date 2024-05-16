//https://www.geeksforgeeks.org/count-number-of-substrings-having-at-least-k-distinct-characters/

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        Map<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        int i=0,j=0,sum=0;
        
        while(j<n && i<n)
        {
            char c = s.charAt(j);
            hm.put(c, hm.getOrDefault(c,0)+1);
            if(hm.size()<k)
            {
            }
            else
            {
                while(hm.size()>=k)
                {
                    char e = s.charAt(i);
                    hm.put(e, hm.get(e)-1);
                    if(hm.get(e)==0)
                    {
                        hm.remove(e);
                    }
                    sum+=n-j;
                    i++;
                }
            }
            j++;
        }
        
        System.out.println(sum);
	}
}
