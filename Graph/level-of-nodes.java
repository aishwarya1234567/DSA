//https://www.geeksforgeeks.org/problems/level-of-nodes-1587115620/1

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int v, ArrayList<ArrayList<Integer>> adj, int X) 
    {
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
        
        return level[X];
    }
}