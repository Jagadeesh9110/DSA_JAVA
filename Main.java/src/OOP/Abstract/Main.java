package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        Child child1=new Child(28);
        Child2 child2=new Child2(34);

        child1.career("Programming");
        child2.career("Doctor");
   // by using the overriding we can use that abstract methods

//        Parent parent=new Parent();// here ot will give error
        // You cannot create the objects of the abstract classes

        Parent.greeting();// we cn use this like this there is no problem in this

        // Although we cannot create the objects for the abstract class we can use it as the reference variable
        Parent child3=new Child2(30);
        child3.career("java developer");// this is by the run-time polymorphism

        // you cannot create the multiple inheritance of two abstract classes(same problem will arise if a common method is present in the two abstract classes then java don't know which one to use)
    }
}
