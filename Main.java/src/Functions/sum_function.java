package Functions;
import java.util.Scanner;
public class sum_function {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1=input.nextInt();
        int num2=input.nextInt();
       int result= sum(num1,num2);
        System.out.println("The sum of given numbers is : "+result);
    }
//    static void sum(int num1,int num2){
//        int result =num1+num2;
//        System.out.println("The sum of given numbers is : "+result);
//    }
// return the values in functions
    static int sum(int num1,int num2){
        return (num1+num2);
    }

}
