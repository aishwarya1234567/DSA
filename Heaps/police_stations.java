//https://docs.google.com/document/d/1BukDSomy2_EuLGxlzkqWhPHEf0O6NqAcmTnKUlqbu10/edit


import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int n=2,k=4,count=1,cost=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer,Boolean> hm = new HashMap<>();
        int[] pol = {7,8};
        for(int i=0;i<n;i++)
        {
            pq.add(new Pair(0,pol[i]));
        }
        
        while(count<=k+n)
        {
            Pair current = pq.poll();
            int dist = current.first;
            int value = current.second;
            
            if(hm.getOrDefault(value, false)==false)
            {
                cost+=dist;
                System.out.println(value+" "+dist);
                if(hm.getOrDefault(value+1, false)==false)
                {
                    pq.add(new Pair(dist+1,value+1));
                }
                if(hm.getOrDefault(value-1, false)==false)
                {
                    pq.add(new Pair(dist+1,value-1));
                }
                hm.put(value, true);
                count++;
            }
        }
        System.out.println(cost);
    }
    
    static class Pair implements Comparable<Pair>{
        int first;
        int second;
        Pair(int first, int second)
        {
            this.first=first;
            this.second=second;
        }
        
        public int compareTo(Pair other)
        {
            return Integer.compare(this.first,other.first);
        }
    }
}
