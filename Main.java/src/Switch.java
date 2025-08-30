
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruits ");
//                break;
//            case "Orange":
//                System.out.println("Most contained vitamin-c fruit ");
//                break;
//            case "Apple":
//                System.out.println("Good for health ");
//                break;
//
//            case "Grapes":
//                System.out.println("small size fruit ");
//                break;
//            default:
//                System.out.println("The given fruit name is not contained in our list");
//
//        }
        // the below one also same but the new enhanced way of writing switch statement

        switch(fruit){
            case "Mango"-> System.out.println("King of fruits ");
            case "Orange"-> System.out.println("Most contained vitamin-c fruit ");
            case "Apple"-> System.out.println("Good for health ");
            case "Grapes"-> System.out.println("small size fruit ");
            default-> System.out.println("The given fruit name is not contained in our list");

        }
    }
}
