//Sum of all pairs in an array
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
        for(int i=0; i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
                System.out.println("Sum of " + arr[i] + "and " + arr[j] + " is : " + (arr[i]+arr[j]));
           }
        }
    }
}