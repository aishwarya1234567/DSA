import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0;i<=10;i++)
        {
            int d = n>>i;
            if((d&1) == 1)
            {
                n ^= 1 << i; 
                break;
            }
        }
        
        System.out.println(n);
    }
}
