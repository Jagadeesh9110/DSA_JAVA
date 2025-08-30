package Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int answer=Fibonacci(5);
        System.out.println( answer);// we are finding the 6th fibonacci number

    }
    public static int Fibonacci(int n){
        if (n<2) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);// this is known as recursion relation
        // here it is not the tail recursion because it will return the final answer by adding

    }
// In this recursion there will be three types of variables(arguments , return type,body of function)


}

// Types of recursive relation
// 1) linear recurrence relation(Fibonacci number)
// 2 ) divide and conquer relation(Binary search, merge sort)
// divide and conquer method is more efficient

