//https://docs.google.com/document/d/1R24yUlnEf7wbSnuE_TkcGglF3VZ8FaMWcNswupIool4/edit?usp=sharing

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = -1, sum=0;
        int[] arr = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                max=Math.max(max,i+1);
            }
            if(hm.containsKey(sum-k))
            {
                max=Math.max(max, i-hm.get(sum-k));
            }
            if(!hm.containsKey(sum))
            {
                hm.put(sum,i);
            }
        }
        
        int i=0,count=0;
        sum=0;
        
        for(int j=0;j<n;j++)
        {
            sum+=arr[j];
            if(j-i+1>=max)
            {
                if(j-i+1==max && sum==k)
                {
                    count++;
                }
                sum-=arr[i];
                i++;
            }
        }
        System.out.println("count: "+count);
    }
}