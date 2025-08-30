package Functions;
import java.util.Arrays;
import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
Function(24);
Function("Manyam Jagadeeswar Reddy");
Function(2,3,4,5,6,7);
Function("Hello","World","!");
    }
    static void Function(int a){
        System.out.println(a);
    }
    static void Function(String name){
        System.out.println(name);
    }// we can write same function names but with different number of arguments or different type of arguments
static void Function(int ...v){
        System.out.println(Arrays.toString(v));
}
    static void Function(String ...v){
        System.out.println(Arrays.toString(v));
    }
// it will call the function based on the arguments
}
