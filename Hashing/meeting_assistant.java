//https://www.desiqna.in/16189/backend-engineer-hackerrank-online-test

import java.util.*;
import java.io.*;

public class HelloWorld {
    public static int convert(String s)
    {
        int first = s.charAt(0)-'0';
        int last = s.charAt(1)-'0';
        
        int time = ((first*10)+last)*60;
        
        int secfirst = s.charAt(3)-'0';
        int seclast = s.charAt(4)-'0';
        
        time += (secfirst*10)+seclast;
        return time;
    }
    
    public static String convertToTime(int sec)
    {
        int hour=sec/60;
        int min=sec%60;
        String res="";
        
        if(hour<10)
        {
            res += "0"+hour;
        }
        else
        {
            res += ""+hour;
        }
        res += ":";
        if(min<10)
        {
            res += "0"+min;
        }
        else
        {
            res += ""+min;
        }
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int[] b = new int[1441];
        int count = 0,flag=0;
        
        for(int i=1;i<=n;i++)
        {
            String startTime = sc.next();
            String endTime = sc.next();
            
            int start = convert(startTime);
            int end = convert(endTime);
            
            b[start]++;
            b[end+1]--;
        }
        
        for(int i=1;i<1441;i++)
        {
            b[i]=b[i-1]+b[i];
            
            if(b[i]==0)
            {
                count++;
                if(count==time)
                {
                    flag=1;
                    System.out.println("free time found at: "+convertToTime(i-time+1));
                    break;
                }
            }
            else
            {
                count=0;
            }
        }
        
        if(flag==0)
        {
            System.out.println("No free time found");
        }
    }
}