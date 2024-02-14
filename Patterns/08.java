/*
Sample Input:
4

Sample Output:
4444
333
22
1
*/

import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);

        int row=sc.nextInt();
        for(int i=row;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}