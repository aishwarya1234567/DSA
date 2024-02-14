/*
Sample Input:
4

Sample Output:
...1 
..12
.123
1234
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);

        int row=sc.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int k=row-i;k>0;k--)
            {
                System.out.print(".");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}