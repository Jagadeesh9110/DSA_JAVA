package OOP.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // collections are like an interface in which there will be lists ,queue,set, etc.
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();

        // we will know more about the collections in the data structures and algorithms like linkedList, queue, maps, arrayList etc.

        // Vector is similar to ArrayList but the difference is multithreading  can not access the vector at a single time only one can access the vector at a single time
        // in a short way vector is Synchronisation
        List<Integer> vector=new Vector<>();
        vector.add(34);
        vector.add(38);
        vector.add(84);
        vector.add(10);
        vector.add(56);

        System.out.println(vector);

    }
}
