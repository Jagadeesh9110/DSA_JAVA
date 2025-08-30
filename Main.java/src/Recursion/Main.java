package Recursion;

public class Main {
    public static void main(String[] args) {
        message();
        // it will call the message method which call another method and so on
        // as soon as the last method ended it will again come to its previous one as that one also ended it will come to its previous
        // this will continue until the starting method will end up then it prints the code
        // This is like a recursion

    }
    public  static void message(){
        System.out.println("Hello world 1");
        message2();
    }
    public static void message2(){
        System.out.println(" Hello world 2");
        message3();
    }
    public static void message3(){
        System.out.println(" Hello world 3");
        message4();
    }
    public static void message4(){
        System.out.println(" Hello world 4");
    }

}
