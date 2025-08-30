package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="  Jagadeeswar Reddy     ";
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.repeat(3));
        System.out.println(name.chars());

        System.out.println(Arrays.toString(name.split(" ")));
        // it will return the array that's why we are using Arrays.toString() method to print the array
        System.out.println(name.trim());// it will remove white spaces ends
    }
}
