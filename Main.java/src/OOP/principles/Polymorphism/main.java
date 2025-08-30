package OOP.principles.Polymorphism;

public class main {
    public static void main(String[] args) {
        shapes Shape=new shapes();
        circle Circle= new circle();
        square Square =new square();
        triangle Triangle=new triangle();
        // here we are creating the objects for each base class and  classes which we derived from the shape class

        Shape.area();
        Circle.area();
        Square.area();
        Triangle.area();// in all it will print methods in the whatever is  present in the methods

        // the act of representing same thing  in multiple ways

        shapes Triangle1=new triangle();

        Triangle1.area();
        // it will print the method which is in the object side how it is working internally we will that using the polymorphism
        // we already know that for an object when it is created what methods and variables are accessed are depend on the referencing type left side
        // type of the reference variable is a parent class  but the object is of the subclass  it will override the parent method
        // in this which method is to called is depend on the object (which is called as upcasting) , it will work by using the dynamic method dispatch
        // and reference type will give the which one to access




        //
        circle newCircle=new circle();
        circle.greeting();// you can inherit but not the overriding
        // we all know that the static methods and variables are not depend on the object
        // we cannot override the static methods

    }
}
// Types of polymorphism
//1) compile time/Static polymorphism -> achieved by method overloading (same name but different data types, arguments, return types ordering can be different
// ex :- multiple constructor
// it will give any errors or any method which does not exist  in the class but we are trying to use that it will find all the errors at compile time , So it is call compile time polymorphism

//2) run time/ dynamic  polymorphism -> achieved by method overriding(When a child class has method same as its parent class
// here it will override the parent class method of same name it will print the child class method which is same as parent class


// In java you cannot override or overload the variables
// class Parent {
//    String message = "Hello from Parent!";
//}
//
//class Child extends Parent {
//    String message = "Hello from Child!";
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Parent obj = new Child();
//        System.out.println(obj.message); // Output: "Hello from Parent!"
//    }
//}
