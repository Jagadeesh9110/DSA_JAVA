package Search;
import java.util.Arrays;
import java.util.Scanner;

// Here in this question the arrya was sorted in both row and column wise
public class BinarySearch_2D_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the order of the matrix: ");
        int m=in.nextInt(),n=in.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int[] num: arr){
            System.out.println(Arrays.toString(num));
        }
        System.out.println("Enter the target element : ");
        int tar=in.nextInt();
        System.out.println("IS "+tar+" exist in the give matrix  : "+Search(arr,tar));
    }

    // binary search when both row and column wise sorted ;
    public static boolean Search(int[][] grid ,int target){
         int row=0,col=grid.length-1;
         while(row<grid.length&& col>=0){
             if(grid[row][col]==target){
                 return true;
             }
             else if(grid[row][col]>target){
                 col--;
             }
             else if(grid[row][col]<target){
                  row--;
             }
         }
         return false;
    }


}
