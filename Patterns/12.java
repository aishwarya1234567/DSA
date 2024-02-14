/*
Sample Input:
5

Sample Output:

*****
 *****
  *****
   *****
    *****
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}