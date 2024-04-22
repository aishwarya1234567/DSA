//https://www.geeksforgeeks.org/reverse-a-string-in-java/

import java.io.*;

import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] s = str.toCharArray();
        int n = s.length;
        int i=0,j=n-1;
        for(int k=0;k<n/2;k++)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }
}
