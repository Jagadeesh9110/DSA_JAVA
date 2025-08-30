package Functions;
import java.util.Scanner;
public class Scope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a=10;
       int b=30;
        {
            int c=20;
//            int a=40;//  we cannot initialize it because it is already initialized outside the block , we can reassign it.

        }
//        System.out.println(c);// we cannot print the variable in outside the block which is initialized inside the block.
         int c=40;// anything that initialized inside the block we can again initialize because that variable is up to that block only
        // but anything that initialized outside the block we cannot initialize inside the block;
    }
}
