//Number of shortest paths from source node to other nodes

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
        int start = 1;
        int[] level = new int[v];
        boolean[] visited = new boolean[v];
        int[] ways = new int[v];
        
        for(int i=0;i<v;i++)
        {
            visited[i] = false;
            level[i] = -1;
            ways[i] = 0;
        }
        
        q.add(start);
        level[start] = 0;
        visited[start] = true;
        ways[start] = 1;
        
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
                    ways[node] += ways[front];
                }
                else
                {
                    if(level[front]+1 == level[node])
                    {
                        ways[node] += ways[front];
                    }
                }
            }
        }
        
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" : "+ways[i]);
        }
    }
}