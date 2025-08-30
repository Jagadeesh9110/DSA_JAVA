package Functions;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println(" Before Swaping the numbers are : "+a+","+b);
        String Result=Swap(a,b);
        System.out.println(Result);
    }
    static String Swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        return "After Swaping the numbers are : "+num1+","+num2;
    }

}
