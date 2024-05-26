//https://www.desiqna.in/12816/morgan-sde1-coding-questions-and-solutions-india-april-2023

import java.util.*;
import java.io.*;

public class Heap {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            pq.offer(sc.nextInt());
        }
        
        while(pq.size()>=2)
        {
            int x=pq.poll();
            int y=pq.poll();
            cost+=x+y;
            pq.offer(x+y);
        }
        System.out.println(cost);
    }
}
