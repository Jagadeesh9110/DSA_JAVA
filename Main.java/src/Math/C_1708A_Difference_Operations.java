package src.Math;

import java.util.Scanner;


public class C_1708A_Difference_Operations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            boolean canZero=true;
            for(int i=1;i<n;i++){
                if (a[i] < a[i - 1]) {
                    canZero = false;
                    break;
                }
            }
         if(canZero){
             System.out.println("YES");
         }else{
             System.out.println("NO");
         }
        }
    }

}
