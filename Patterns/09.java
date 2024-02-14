/*
Sample Input:
3

Sample Output:
1=1
1+2=3
1+2+3=6
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            int sum = 0;
            for(int j=1;j<=i;j++)
            {
                sum += j;
                System.out.print(j);
                if(i!=j)
                {
                    System.out.print("+");
                }
            }
            System.out.println("=" + sum);
        }
    }
}