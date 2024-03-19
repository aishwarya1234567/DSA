//https://www.desiqna.in/dp2

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] dp = new int[size];
        
        for(int i=0; i < size; i++)
        {
            arr[i] = sc.nextInt();
            if(i==0 || i==1)
            {
                dp[i] = arr[i];
            }
            else
            {
                dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
            }
        }
        
        System.out.println("Maximum result is: "+dp[size-1]);
    }
}