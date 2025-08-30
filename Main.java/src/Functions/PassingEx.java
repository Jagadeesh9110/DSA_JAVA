package Functions;

import java.util.Scanner;
public class PassingEx {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name="Jagadeeswar";
        changeName(name);
        System.out.println(name);
    }// here although we passed the name and we change it in the function it will print Jagadeeswar only
    // because in Java there is no concept of pass by reference in the function name and main function name variables are different
    static void changeName(String name){
        name="Manyam Jagadeeswar";
    }
// Primitives (int ,short,String,char,value) are just pass by value
    // Objects and reference variables are passing by value only but of the reference
    // if you make a change to the object via with this reference variable ,same object will change
}
// any function if changes made that scope will in that  function only