package OOP.principles.Polymorphism;

public class shapes {

    // late binding
    void area(){
        System.out.println(" Now we are in area of shapes");
    }
    // if we put final keyword you cannot override the method

    // early-binding
//   final void area(){
//        System.out.println(" Now we are in area of shapes");
//    }

    static void greeting(){
        System.out.println("Hello now i am in the shapes class ");
    }

}
// so , final keyword is used to prevent overriding and inheritance