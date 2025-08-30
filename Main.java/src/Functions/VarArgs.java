package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Function(2,3,4,5,6);
        MixingArgs(20,30,"Manyam","Jagadeeswar","Reddy");
    }
    static void MixingArgs(int a, int b, String ...v){
        System.out.println(a+","+b+","+Arrays.toString(v));

    }

    static void Function(int ...v){
      System.out.println(Arrays.toString(v));
    }

}
