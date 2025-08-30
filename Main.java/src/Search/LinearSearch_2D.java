package Search;
import java.util.Scanner;
public class LinearSearch_2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[][] arr=new int[size][size];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=in.nextInt();
            }
        }
        System.out.print("Enter the target number : ");
        int tar=in.nextInt();
        search(arr,tar);

    }
    public static void search(int[][] Arr ,int target){
        if(Arr.length==0){
           System.out.println(target+" number was not found ");
        }
          for(int i=0;i<Arr.length;i++){
              for(int j=0;j<Arr[i].length;j++){
                  if(Arr[i][j]==target){
                      System.out.println(target+" is Found at "+i+"."+j );
                  }
              }
          }

    }

}
