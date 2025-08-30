import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        float num1=input.nextFloat();
//        int num2=input.nextInt();
//        float sum=num1+num2;
//        float difference=num1-num2;
//        System.out.println("Sum : "+sum);
//        System.out.println("Difference : "+difference);
//
//        // Type Casting
//        // In type conversion higher priority data types can be done type conversion of smaller data types
//        // we can do smaller data types like below line code
//        int num=(int)(input.nextFloat());
//        System.out.println(num);
         // Automatic type Promotion in expressions
//        int a=257;
//        byte b=(byte)(a);// 257 % 256=1
//        System.out.println(b);//it will give one because if number is greater thatn the size it will give the remainder of size and number;
//        byte c=40;
//        byte d=50;
//        int e=c*d/10;// here it will done like becuase in expressions it will be int not byte that's why not giving error
//        System.out.println(e);
//
//        int num3='A';
//        System.out.println(num3);// Here it will do type cast and it will give ascii value of 'A'
        //Example problem
        int a=40;
        float b= 30.6575f;
        byte c=50;
        char d= 'A';
        double e=4375.48753487;
        double result=(a+b)-(d-a)+(b*e);
        System.out.println((a+b)+" " +(d-a)+" "+(b*e));
        System.out.println(result);
    }
}
