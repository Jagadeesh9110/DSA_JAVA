package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print1(1);// it als similar example as the message example

        // how the function works internally(Not only for recursion it is for like any general function)
        // When the function  is not finished executing it will remain in the stack memory
        // all the function calls will be stored in the stack memory
        // And also we know that primitive data types and reference variables are also stored in the stack memory
        // When  a function finishes the execution , it will be removed from the stack memory and flow of program is restored to where that function was called

    }
    public static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    public static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    public static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    public static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    public static void print5(int n){
        System.out.println(n);

    }



}
