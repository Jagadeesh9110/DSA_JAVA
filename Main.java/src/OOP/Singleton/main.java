package OOP.Singleton;

public class main {
    public static void main(String[] args) {
        singelton obj1=singelton.getInstance();

        singelton obj2=singelton.getInstance();

        singelton obj3=singelton.getInstance();

        // all three reference variables are pointing to same just one  object
        /// it is useful when we create only one object
    }
}
