//https://www.codechef.com/problems/APPENDOR

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        for(int s=1; s<=q; s++)
        {
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] a = new int[n];
            int res = 0, start, end, num=0;
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                res |= a[i];
            }
            
            for(int i=60;i>=0;i--)
            {
                int d1 = res >> i;
                
                start = (d1 & 1) == 1 ? 1 : 0;
                
                int d2 = sum >> i;
                
                end = (d2 & 1) == 1 ? 1 : 0;
                
                if(start != end)
                {
                    if(start == 0)
                        num |= 1<<i;
                    else
                    {
                        num = -1;
                        break;
                    }
                }
            }
            
            System.out.println(num);
        }
	}
}

