/*
Sample Input:
4

Sample Output:
1357
3571
5713
7135 
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
            for(int j=2*i-1;j<=2*row-1;j=j+2)
            {
                System.out.print(j);
            }
            for(int j=1;j<i;j++)
            {
                System.out.print(2*j-1);
            }
            System.out.println();
        }
    }
}