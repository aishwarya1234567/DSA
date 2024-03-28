//https://www.desiqna.in/13736/arcesium-oa-sde1-jan-2023

import java.util.*;
import java.io.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        HashMap<Character, Integer> h3 = new HashMap<>();
        HashMap<Character, Integer> h4 = new HashMap<>();
        
        for(int i=0;i<s1.length();i++)
        {
            Character c = s1.charAt(i);
            if(i%2==0)
            {
                h1.put(c, h1.getOrDefault(c,0)+1);
            }
            else
            {
                h2.put(c, h2.getOrDefault(c,0)+1);
            }
        }
        
        for(int i=0;i<s2.length();i++)
        {
            Character c = s2.charAt(i);
            if(i%2==0)
            {
                h3.put(c, h3.getOrDefault(c,0)+1);
            }
            else
            {
                h4.put(c, h4.getOrDefault(c,0)+1);
            }
        }
        
        if(h3.equals(h1) && h4.equals(h2))
        {
            System.out.println("Twins");
        }
        else
        {
            System.out.println("Not twins");
        }
    }
}