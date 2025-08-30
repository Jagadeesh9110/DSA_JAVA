package Strings;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int[] arr={2,3,4,5,6};
        // here arr is like aof data type of int
        //similarly there is string as we learned and used so far like int
        String name="jagadeeswar";
        System.out.println(name);

        // there will be iternal working of strings
        // here String is data type , name is reference variable and "jagadeeswar" is object

        // In strings there is like string pooling , Immutability

        // string pool is a separate memory inside  the heap( it will be like string pooling because all the similar values of the strings are not like degraded in the heap)
     // so if we create two reference variables of same value of object it will point to sam object there will be no two objects present
        // if the object values are same that two reference variables are pointing to pool memory
        String b=" random name ";
        String c="random name ";
        // here random name is a string pooling so both b and c are point to same object it will not create two objects of "random name"
         // we will have a doubt like arrays also we are doing same thing in the arrays if we change one thing it will reflect to another one also
        // but in the strings it will reflect to others because of immutability
         //  means , in strings you cannot change the object this is immutability if you want to change the name of the object it will create new object in that String pooling (separate memory)
         // that reference variable will point to that newly changes (or) created object, that old object will be removed by the garbage collection if no other reference variable is pointing




    }
}
