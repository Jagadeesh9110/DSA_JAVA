package OOP.Access;

import java.util.Arrays;

public class subClass extends A{
    public subClass(int num, String name,int age) {
        super(num, name,age);
    }


    public static void main(String[] args) {
        subClass obj=new subClass(10,"SubClass object",20);
        int[] Arr=obj.arr;
        System.out.println(Arrays.toString(Arr));
        // public member you can access anywhere in the world even in the different packages also

        // if the access modifier is protected then you can use that member variable in its subclass and itself , but different package and no subclass you can not use it
       obj.age=30;
        System.out.println(obj.age);


        // you can use the member in a different package in a subclass only you cannot use in same class in outside the package (different package)



        // Instance of

        System.out.println(obj instanceof A);// ture
        System.out.println(obj instanceof Object);// true ,everything class is instance of Object root class so, that will be true

    }
}

