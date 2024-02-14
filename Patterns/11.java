/*
Sample Input:
6

Sample Output:

******
*   *
*  *
* *
*

*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=row;i>0;i--)
        {
            if(i==2)
                continue;
            for(int j=i;j>0;j--)
            {
                if(i==row || i==1 || j==i || j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}