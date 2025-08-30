package Sorting;
import java.util.Arrays;
import java.util.Scanner;
// Insertion sort is like insert an element from the given array to its left handed in a sorted way
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Elements before sorting : " + Arrays.toString(arr));
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }

        System.out.println("Elements after sorting : " + Arrays.toString(arr));
    }
    public static void swap(int[] Arr,int a,int b){
        int temp=Arr[a];
        Arr[a]=Arr[b];
        Arr[b]=temp;
    }
}
