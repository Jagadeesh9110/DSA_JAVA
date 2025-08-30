package arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        // Syntax;
        ArrayList<Integer> list=new ArrayList<>(5);
        Scanner input=new Scanner(System.in);
//        list.add(12);
//        list.add(13);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//        list.add(11);
    //    System.out.println(list);// although we gave initial capacity is 10 we are adding tp the list more than the 10 elements this will understand whenwe know about the internal working of Array List
/*
*
* If you add more elements than the initial capacity, the ArrayList automatically increases its size to accommodate the new elements.

*  This resizing operation involves creating a new array with a larger capacity and copying the elements from the old array to the new one.
The default growth strategy for an ArrayList typically involves increasing the size of the internal array by about 50% of its current
size when it runs out of space.
*
* */
        // Input
        for(int i=0;i<5;i++){
            list.add(input.nextInt(),input.nextInt());
        }

        System.out.println(list);
        // we can also get individually
//        for(int i=0;i<5;i++){
//            System.out.println(list.get(i));
//        }

    System.out.println( list.contains(4)) ;
    list.set(0,40);
        System.out.println( list) ;
        list.remove(3);
        System.out.println( list) ;
    }
}
