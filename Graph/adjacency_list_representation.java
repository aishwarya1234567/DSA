import java.util.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            
            adj.get(s).add(d);
            adj.get(d).add(s);
        }
        
        for(int i=0;i<v;i++)
        {
            int count = 0;
            for(Integer node : adj.get(i))
            {
                count ++;
            }
            System.out.println(i + " " + count);
        }
    }
}