//https://www.desiqna.in/dynamic-programming

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] sum = new int[size];
        
        for(int i=0; i < size; i++)
        {
            arr[i] = sc.nextInt();
            if(i==0)
            {
                sum[i] = arr[i];
            }
            else
            {
                sum[i] = sum[i-1] + arr[i];
            }
        }
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++)
        {
            int idx = sc.nextInt();
            System.out.println(sum[idx]);
        }
    }
}