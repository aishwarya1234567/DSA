/*
Create the given pattern 
000000
000000
000000
000000
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
