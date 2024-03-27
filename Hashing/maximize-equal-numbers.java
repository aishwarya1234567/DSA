//https://www.desiqna.in/16114/visa-oa-sde-intern-ctc-30-lac-27th-oct
//https://www.desiqna.in/13650/google-girl-hackathon-coding-questions-solutions-2023-kumar

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int val=2000,max=-1;
        int[] arr = new int[n];
        int[] b = new int[val];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            int l = arr[i]-k;
            int r = arr[i]+k;
            
            b[l] = b[l]+1;
            if(r+1<val)
                b[r+1] = b[r+1]-1;
        }
        
        for(int i=1;i<val;i++)
        {
            b[i]=b[i-1]+b[i];
            max=Math.max(b[i],max);
        }
        
        System.out.println("Maximum length of subsequence:"+max);
            
        for(int num:b)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}