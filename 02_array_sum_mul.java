//Sum and multiplication of all number in Arrays
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
        int sum=0,mul=1;
        for(int num : arr)
        {
            sum += num;
            mul *= num;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Multiplication is : " + mul);
    }
}