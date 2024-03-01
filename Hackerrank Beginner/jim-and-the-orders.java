//https://www.hackerrank.com/challenges/jim-and-the-orders/problem?isFullScreen=true

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
    
    public static int finder(int arr[], int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }
    /*
     * Complete the 'jimOrders' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY orders as parameter.
     */

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
        List<Integer> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[orders.size()];
       
        for(int i=0;i<orders.size();i++)
        {
            arr[i] = orders.get(i).get(0) + orders.get(i).get(1);
        } 
       
        for(int num : arr)
        {
            list.add(num);
        }
        
        Collections.sort(list);
        
        for(int num : list)
        {
            int temp = finder(arr, num);
            res.add(temp+1);
            arr[temp] = 0;
        }
       
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> orders = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                orders.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.jimOrders(orders);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
