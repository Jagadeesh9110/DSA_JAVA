package Strings;

import java.util.Arrays;

public class Comparison {
    // we will know that how many reference variables are pointing to the same object by the string comparisons

    public static void main(String[] args) {
        // String comparisons can be done by two methods == and equals() method
        // == this will tell us about that the two reference variables pointing to the same object or not
        String a="jagadeeswar";
        String b="jagadeeswar";

        System.out.println(a==b);// here it will give the true because both reference variables are pointing to the same object in java this will be done by default internally

        // .equals method will check the two reference variables are contains the same value or not , no matter it is pointing to the same objects or not
        // if we want to create new object of same values of two variables we will use new keyword to create new object

        String c=new String("Jagadeeswar");
        String d=new String("Jagadeeswar");
        // here it will create two different objects of same value
        // it will create the objects outside the pool memory but in the heap only
        System.out.println(c==d);// now it will give the false although the value of the object is same because both are not pointing to the same object

        System.out.println(c.equals(d));// it will give true it will only check the value of the objects
        // Strings are internally working like an array but we cannot write like the below code to get the value of at an index
       // System.out.println(c[0]);// this will give he error
        
        // we have a method to access the value at an index using the charAt method
        System.out.println(c.charAt(0));

        System.out.println(56);
        // it will be working for all printing and all using the printStream class in which there will be more methods no matter what type of data type you are passing
        System.out.println(new int[]{2,3,3,4});
        //when an object is being passed to the printStream it will print he random value as the default value because internally there is toString method that will the random value of like hashcode and @ like
   // so to the print the Arrays we will use the inbuilt arrays class method called toString it will override the above hashcode and all
      System.out.println(Arrays.toString(new int[]{1,2,3,4}));

       // System.out.println(56.toString());// we cannot do it like this it is primitive data type not he classes and all
        // you can do this  using the wrapper classes
        Integer num=new Integer(56);
        System.out.println(num);// here it will print he 56
    }


}
