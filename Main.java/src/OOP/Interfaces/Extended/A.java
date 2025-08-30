package OOP.Interfaces.Extended;

public interface A {
    static void greeting(){
        // static methods should always have the body you cannot override it
        System.out.println("I am in the static method");
    }
//static void greeting();// this will you error ,not allowed

    void fun();
}
