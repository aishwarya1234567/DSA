//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

	/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String s="abczf";
		String s1="azdb";
		int i=0,j=0,count=0;
		while(i<s.length() && j<s1.length())
		{
		    char c=s.charAt(i);
		    char d=s1.charAt(j);
		    
		    if(c==d)
		    {
		        count++;
		        i++;
		        j++;
		    }
		    else
		    {
		        i++;  
		    }
		}
		System.out.println(s1.length()-count);
	}
}
