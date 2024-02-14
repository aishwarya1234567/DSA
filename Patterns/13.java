/*
Sample Input:
5

Sample Output:

  *
 ***
*****
 ***
  *
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int x = row/2;

        //For upper half
        for(int i=0;i<=x;i++)
        {
            for(int j=0;j<x-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();            
        }

        //For lower half
        for(int i=row-x-1;i>0;i--)
        {
            for(int j=0;j<=x-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();            
        }
    }
}