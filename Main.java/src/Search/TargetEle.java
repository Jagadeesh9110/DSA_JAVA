package Search;
import java.util.ArrayList;

import java.util.Scanner;

public class TargetEle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> ArrList=new ArrayList<>();
        System.out.print("Enter the number: ");
        int target=in.nextInt();
        boolean value=false;
        int index=0;
        for(int i=0;i<5;i++){
            ArrList.add(i,in.nextInt());
        }
        for(int i=0;i<5;i++){
            if(ArrList.get(i)==target){
               value=true;
               index=i;
                break;
            }

        }
       if(value){
           System.out.println(target+" is  found in the List at index "+index);
       }
       else{
           System.out.println(target+" is not found in the List ");
       }
    }
}
