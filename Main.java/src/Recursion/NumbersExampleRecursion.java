package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);// it als similar example as the message example
        // Instead of writing all these functions for every thing we can all the function itself
        // this is called as recursion

        // if there is no base condition then it will make the calls continuously and stack keep on filling, every call there will be alloted some memory
        // it will keep on going until the computer memory is exceeded which stackOverflow

        // that's why the base condition is needed
    }
    public static void print(int n){
       if(n==5){ // this is the terminating condition (or) base condition to stop the recursion
           System.out.println(n);
           return;
       }
        System.out.println(n);

       // this is called as tail recursion
      //  this is the last function called
        print(n+1);// here we are calling the function itself

        // it will also print the result as same as previous number example
    }
}
// recursion helps in break down the bigger problems into the smaller problems
// You convert recursion Solution s into iteration and vice-versa

// we know how the recursion can be converted into iterations and vice-versa in stacks and queues