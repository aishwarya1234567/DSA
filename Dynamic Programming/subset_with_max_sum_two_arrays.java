//https://www.desiqna.in/dp3

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] brr = new int[size];
        
        int[] dp = new int[size];
        
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++)
        {
            brr[i] = sc.nextInt();
        }
        
        dp[0] = Math.max(arr[0],brr[0]);
        dp[1] = Math.max(dp[0],Math.max(arr[1],brr[1]));
        
        for(int i=2;i<size;i++)
        {
            dp[i] = Math.max(Math.max(arr[i],brr[i])+dp[i-2],dp[i-1]);
        }
        
        System.out.println("Maximum result is: "+dp[size-1]);
    }
}