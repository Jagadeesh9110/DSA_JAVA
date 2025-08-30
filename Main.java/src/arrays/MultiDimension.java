package arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int[][] Array=new int[3][4];

//      int[][] Array={
//              {1,2,3},
//              {4,5,},
//              {6,7,8,9}
//      };
        System.out.println("Enter the Elements of array : ");
      for(int i=0;i<Array.length;i++){// row
          for(int j=0;j<Array[i].length;j++){// cloumn
              Array[i][j]=input.nextInt();
          }
      }

      System.out.println("Elements in the array are : ");
//        for(int i=0;i<Array.length;i++){// row
//            for(int j=0;j<Array[i].length;j++){// column// here we are taking terminating condition like column <Array[row].length
//
//                System.out.print(Array[i][j]+" ");
//
//            }
//            System.out.println();
//        }

        // it another way of printing the elements
//        for(int i=0;i<Array.length;i++){
//            System.out.println(Arrays.toString(Array[i]));
//        }
        // There is enhanced way of array
        for(int[] arr:Array){
            System.out.println(Arrays.toString(arr));
        }
    }
}
