/*
Sample Input:
7

Sample Output:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
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
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(i+65));
            }
            System.out.println();
        }
    }
}