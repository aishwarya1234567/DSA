//https://atcoder.jp/contests/dp/tasks/dp_a

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] dp = new int[size];
        
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        dp[0] = 0;
        dp[1] = Math.abs(arr[1]-arr[0]);
        
        for(int i=2; i<size; i++)
        {
            int x = Math.abs(arr[i-1]-arr[i])+dp[i-1];
            int y = Math.abs(arr[i-2]-arr[i])+dp[i-2];
            dp[i] = Math.min(x,y);
        }
        
        System.out.println("Minimum cost to reach last node is: "+ dp[size-1]);
    }
}