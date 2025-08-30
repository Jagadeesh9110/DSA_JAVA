package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a'+'b');// it will print the addition of the two ascii values
        System.out.println("a"+"b");// here it is happening concatenation of strings
        System.out.println('a'+3);// here it will print here ascii value of a +3

        System.out.println((char)('a'+3)); // here we are doing the type casting which prints the character of the resultant ascii value

        System.out.println("a"+1);
        // the result after internally few steps: "a"+"1"
        // int value will be converted into Integer wrapper class and call the toString method

        System.out.println("Random"+new ArrayList<>());
        System.out.println("Random"+new int[]{1,2,3,4});// it will print the combining of random and some hashcode

        System.out.println("Random"+new Integer(34));// here also same

        // in above all these it will concatenation will come into picture

//        System.out.println(new Integer(34)+new ArrayList<>());// this will you give the error
        // you cannot use like the above code
        // in java + operator can be used for primitive data types
        // you can use for all these objects also but at least one of the operands should be the string

        System.out.println(new Integer(34)+" "+new ArrayList<>());// this will work

        // On strings + operator is overloaded which is happening for the concatenation of strings
        // In strings it is doing operator overloading to concatenate the strings
        // java is not supported the operator overloading (You cannot do it operator overloading for like arrays ,hashmaps etc. )


        // if any data type is type among all the data types then the answer is also the string
        System.out.println("a"+'b');// Output will be ab

    }
}
