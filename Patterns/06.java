/*
Sample Input:
5

Sample Output:
E
D E
C D E
B C D E
A B C D E
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
            for(int j=i;j>=0;j--)
            {
                System.out.print((char) (65+row-j-1));
            }
            System.out.println();
        }
    }
}