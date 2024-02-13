/*
Sample Input:
4

Sample Output:
A
B C
C D E
D E F G
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
            for(int j=i;j<=2*i;j++)
            {
                System.out.print((char)(65+j)+" ");               
            }
            System.out.println();
        }
    }
}