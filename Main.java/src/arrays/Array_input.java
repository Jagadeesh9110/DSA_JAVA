package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Array_input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a=1,size=input.nextInt();
        System.out.println();
        // Array of primitives
//        int[] Array=new int[size];
//        for(int i=0;i<size;i++){
//            Array[i]=11*a;
//            a++;
//        }
// we can input the elements at run time
//        System.out.println("Enter the Elements of the array : ");
//        for(int i=0;i<size;i++){
//            Array[i]=input.nextInt();
//        }
//
//        System.out.println("Elements in the array are : ");

        // 1st way of printing
//        for(int i=0;i<size;i++){
//            System.out.print(Array[i]+" ");
//        }

        // 2 way of printing
//        for(int num:Array){// for every element in the array , print that array
//            System.out.print(num+" ");// here num represent element of the Array
//        }

        // we can print the elements of array using toString method ( the best way)

//        System.out.println(Arrays.toString(Array));

        // Array of objects

        String[] str=new String[size];
        for(int i=0;i<size;i++){
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
