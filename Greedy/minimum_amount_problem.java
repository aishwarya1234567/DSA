//https://www.desiqna.in/17022/dbs-oa-sde1-intern-ctc-35-l-set-01-2024

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    int c1 = sc.nextInt();
	    int c2 = sc.nextInt();
	    int c3 = sc.nextInt();
	    int co1 = sc.nextInt();
	    int co2 = sc.nextInt();
	    int co3 = sc.nextInt();
	    int val = Integer.MAX_VALUE;
	    for(int i=0;i<=c1;i++)
	    {
	        for(int j=0;j<=c2;j++)
	        {
	            int k=(s-(2*i+3*j))/5;
	            if(k>=0 && k<=c3)
	            {
	                int cost = co1*i+co2*j+co3*k;
	                val=Math.min(val, cost);
	            }
	        }
	    }
	    System.out.println(val);
	}
}
