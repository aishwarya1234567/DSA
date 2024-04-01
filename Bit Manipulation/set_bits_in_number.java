import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=10;i>=0;i--)
        {
            int d = n>>i;
            if((d&1) == 1)
                count++;
        }
        
        System.out.println(count);
    }
}
