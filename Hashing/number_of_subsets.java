//https://leetcode.com/discuss/interview-question/3114099/AMAZON-OA-(INTERN-2024)

import java.util.*;
import java.io.*;

public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      String t = sc.next();
      int min = Integer.MAX_VALUE, flag=1;
      
      HashMap<Character, Integer> freq_s = new HashMap<>();
      HashMap<Character, Integer> freq_t = new HashMap<>();
      
      for(int i=0;i<s.length();i++)
      {
          char c = s.charAt(i);
          freq_s.put(c, freq_s.getOrDefault(c, 0)+1);
      }
      
      for(int i=0;i<t.length();i++)
      {
          char c = t.charAt(i);
          freq_t.put(c, freq_t.getOrDefault(c, 0)+1);
      }
      
      for(int i=0;i<t.length();i++)
      {
          char c = t.charAt(i);
          if(!freq_s.containsKey(c))
          {
              flag = 0;
              break;
          }
          min = Math.min(min, freq_s.get(c)/freq_t.get(c));
      }
      if(flag == 1)
      {
        System.out.println("Min : "+min);
      }
      else
      {
        System.out.println("Min : 0");
      }
    }
}