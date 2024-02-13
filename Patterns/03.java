/*
Sample Input:
5

Sample Output:
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
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
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
