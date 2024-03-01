//https://www.hackerrank.com/challenges/insertionsort1/problem?h_r=next-challenge&h_v=zen&isFullScreen=true

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

    public static void print(List<Integer> arr)
    {
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
        int temp = arr.get(n-1);
        int j = n-2;
        
        while(j>=0 && arr.get(j)>temp)
        {
            int num = arr.get(j);
            arr.set(j+1, num);
            j--;
            print(arr);
        }
        arr.set(j+1,temp);
        print(arr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
