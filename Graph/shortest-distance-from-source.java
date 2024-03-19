//https://www.hackerearth.com/problem/algorithm/shortest-distance-from-source/?purpose=login&source=problem-page&update=google

import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<=v;i++)
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
        int start = sc.nextInt();
        int[] level = new int[v+1];
        boolean[] visited = new boolean[v+1];
        
        for(int i=1;i<=v;i++)
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
        }    // Writing output to STDOUT

        for(int i=1;i<=v;i++)
        {
            System.out.print((level[i]-level[start])+" ");
        }
    }
}
