import java.util.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        
        int[][] adj = new int[v][v];
        
        for(int i=0;i<v;i++)
        {
            Arrays.fill(adj[i], 0);
        }
        
        for(int i=0;i<e;i++)
        {
            int s = sc.nextInt();
            int d = sc.nextInt();
            
            adj[s][d] = 1;
            adj[d][s] = 1;
        }
        
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<v;i++)
        {
            int count = 0;
            for(int j=0;j<v;j++)
            {
                if(adj[i][j] == 1)
                    count ++;
            }
            System.out.println(i + " : " + count);
        }
    }
}