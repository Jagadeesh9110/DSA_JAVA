package OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human obj1=new Human("suresh",24);
//        Human obj2=new Human(obj1);
        // here problem is it will take more time to copy other object
        // to overcome this problem we are using the cloning(exact copy of other object) , it is method in the object class
        // in java there is an interface cloneable

        /// if we are using any exception method inside any class you should mention the throws an exception at class name
        Human obj2=(Human)obj1.clone();// we are using the clone method from the object class
        System.out.println(obj2.age+" "+ obj2.name);

        System.out.println(Arrays.toString(obj2.arr));

        // shallow and deep copy

        obj2.arr[0]=10;

        System.out.println(Arrays.toString(obj1.arr));// here it is changing the first index value of the arr, this is due to shallow copy
        // when we copy an object for primitive variables it will create new variable but for non-primitive (arrays,strings etc.) ,
        // reference variable wll not create new one it will point to the object same as the copying reference variable
        // that's why here change is reflecting in the original one also  , this is the shallow copy

        // if we don't want like this we want to create new objet for new reference variable we will use the deep copy method we will change i the human class clone method like deep copy

    }
}
