import java.util.*;
import java.io.*;

public class Solution
{
    public static void main(String[] args) {
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
        
        boolean[] visited = new boolean[v+1];
        int[] parent = new int[v+1];
        int start = 1;
        
        Arrays.fill(visited, false);
        Arrays.fill(parent, -1);
        
        dfs(start, adj, visited, parent);

        for(int i=1;i<=v;i++)
        {
            System.out.println(i+" => visited: "+visited[i]+", parent: "+parent[i]);
        }
    }
    
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] parent)
    {
        visited[node] = true;
        System.out.println(node);
        
        for(Integer neighbour : adj.get(node))
        {
            if(!visited[neighbour])
            {
                parent[neighbour] = node;
                dfs(neighbour, adj, visited, parent);
            }
        }
    }
}