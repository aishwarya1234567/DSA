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
        
        Queue<Integer> q = new LinkedList<>();
        int start = 0;
        int[] level = new int[v];
        boolean[] visited = new boolean[v];
        
        for(int i=0;i<v;i++)
        {
            visited[i] = false;
            level[i] = -1;
        }
        
        q.add(start);
        level[start] = 0;
        visited[start] = true;
        
        while(!q.isEmpty())
        {
            int front = q.peek();
            q.poll();
            
            for(Integer node : adj.get(front))
            {
                if(!visited[node])
                {
                    q.add(node);
                    visited[node] = true;
                    level[node] = level[front] + 1;
                }
            }
        }
        
        for(int i=0;i<v;i++)
        {
            if(visited[i])
            {
                System.out.println("Node "+i+" is reachable from Node "+start);
            }
            else
            {
                System.out.println("Node "+i+" is not reachable from Node "+start);
            }
        }
    }
}