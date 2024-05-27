//https://www.desiqna.in/15202/bny-mellon-oa-july-2023-sde-team-formation

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] v = {10, 20, 10, 15, 5, 30, 20};
        // int[] v = {17, 12, 10, 2, 7, 2, 11, 20};
        int k = 3, team_size = 2;
        // int k = 4, team_size = 3;
        int f=0,b=v.length-1,sum=0;
        
        PriorityQueue<Integer> f_pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> b_pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k && f<=b;i++)
        {
            f_pq.offer(v[f]);
            f++;
            b_pq.offer(v[b]);
            b--;
        }
        f--;
        b++;
        
        while(team_size>0)
        {
            if(f_pq.peek()>b_pq.peek())
            {
                sum+=f_pq.poll();
                if(f<=b)
                {
                    f_pq.offer(v[f]);
                    f++;
                }
            }
            else
            {
                sum+=b_pq.poll();
                if(f<=b)
                {
                    b_pq.offer(v[b]);
                    b--;
                }
            }
            team_size--;
        }
        System.out.println(sum);
    }
}
