/*
Sample Input:
5

Sample Output:
    1
   232
  34543
 4567654
567898765

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
            for(int j=row-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=2*i-1;j++)
            {
                System.out.print(j);
            }
            for(int k=2*i-2;k>=i;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
