package Search;
import java.util.Scanner;

public class LinearSearch_Strings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string name : ");
        String str=in.nextLine();
        char tar=in.next().charAt(0);
       boolean isFound= Search_String(str,tar);
       System.out.println(isFound);
    }
    public static boolean Search_String(String str,char target){
       if(str.length()==0){
           return false;
       }
       for(char letter:str.toCharArray()){
           if(letter==target){
               return true;
           }
       }
     return false;
    }

}
