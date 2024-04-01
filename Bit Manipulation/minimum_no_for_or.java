//https://docs.google.com/document/d/1mK63LZViwFKWi3YztFEu2Wei7M84NoXhKB2IL9Xgvjw/edit?usp=sharing

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int num = 0, start, end;
        
        for(int i=10;i>=0;i--)
        {
            int d1 = n1>>i;
            
            if((d1&1)==1)
            {
                start = 1;
            }
            else
            {
                start = 0;
            }
            
            int d2 = n2>>i;
            
            if((d2&1)==1)
            {
                end = 1;
            }
            else
            {
                end = 0;
            }
            
            if(start == end)
            {
            }
            else
            {
                if(start == 1)
                {
                    num = -1;
                    break;
                }
                else
                {
                    num |= 1<<i;
                }
            }
        }
        
        System.out.println(num);
    }
}
