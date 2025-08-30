package OOP.Singleton;

import OOP.Access.A;

public class subclassD extends A {

    public subclassD(int num, String name, int age) {
        super(num, name, age);
    }

    public static void main(String[] args) {
        subclassD obj=new subclassD(10,"subClass different",20);
        obj.age=10;
        System.out.println(obj.age);// here you can access becuase in the class A age memeber is protected you can use in different package in a subclass

    }
}
