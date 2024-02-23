//Introduction to ArrayList
import java.util.*;
import java.io.*;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i < size; i++)
        {
            arr.add(sc.nextInt());
        }
        System.out.println("Elements of the array are: ");
        for(int i=0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }

        arr.add(2,99);
        System.out.println("Elements of the array are after pushing 99: ");
        for(int i=0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        arr.set(2,2);
        System.out.println("Elements of the array are after setting 2: ");
        for(int i=0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i) + " ");
        }
    }
}