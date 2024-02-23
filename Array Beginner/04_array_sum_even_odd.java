//Sum of even numbers and odd numbers in an array 
import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int even_sum=0, odd_sum=0;
        for(int num : arr)
        {
            if(num % 2 == 0)
            {
                even_sum += num;
            }
            else
            {
                odd_sum += num;
            }
        }
        System.out.println("Sum of even numbers in the array is : " + even_sum);
        System.out.println("Sum of odd numbers in the array is : " + odd_sum);
    }
}