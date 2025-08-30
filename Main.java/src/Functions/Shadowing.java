package Functions;

public class Shadowing {
    static int x=40;// This will be shadowed at line 11
    // we cannot use object dependent things in object independent things
    // anything that initializing the variable outside the main function that we want to use inside the main function we want to put static key word

    public static void main(String[] args) {
        System.out.println(x);// it will print 40
        int x=50;// the class variable at line 4 is shadowed by this
        System.out.println(x);// it will print 50
        // it will overlap the both scope of variables
    }
}
