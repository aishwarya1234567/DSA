//Inputting an integer array and displaying the elements
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
        System.out.println("Elements of the array are: ");
        for(int num : arr)
        {
            System.out.println(num + " ");
        }
    }
}