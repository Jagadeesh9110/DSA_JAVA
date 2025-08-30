package OOP.Interfaces.Extended;

public class Main implements B{

    @Override// it is annotation, it is also a public interface
    public void greet() {
        System.out.println("I am in the greet method");
    }

    @Override
    public void fun() {
        System.out.println("I am in the fun method");
    }
    // here we are overriding the both the interfaces methods because B Interface extends the A also

    public static void main(String[] args) {
        Main obj=new Main();

        A.greeting();// we cannot call through the object we should call via the interfaces name here

    }
}
