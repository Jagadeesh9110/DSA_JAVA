package OOP.principles.Polymorphism;

public class circle extends shapes {

//    this will run when circle obj is created
    // hence it will be overriding the parent method
    @Override
    void area(){
        System.out.println("Area of circle is pie*r*r");
    }

//    @Override// here it will give error because we cannot override the static methods
    static void greeting(){
        System.out.println("Hello now i am in the circle class ");
    }

}
