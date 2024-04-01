import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        for(int i=10;i>=0;i--)
        {
            int digit = num>>i;
            
            if((digit&1)==1)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("0");
            }
        }
    }
}
