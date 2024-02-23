//https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        int hh =(s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        StringBuilder res = new StringBuilder();
        if(s.charAt(8) == 'A')
        {
            if(hh == 12)
            {
                res.append("00");
            }
            else if(hh < 12)
            {
                res.append("0").append(hh);
            }
            else
            {
                res.append(hh);
            }
        }
        else
        {
            if(hh == 12)
            {
                res.append("12");
            }
            else
            {
                res.append((hh+12));
            }
        }
        for(int i=2;i<s.length()-2;i++)
        {
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
