package Sorting;
import java.util.Arrays;
import java.util.Scanner;
// Bubble sort is a comparison based method
public class bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean result = false;
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Elements before sorting : " + Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j, i);
                    result = true;
                }
            }
            if(!result)
            {
                break;
            }
        }
        System.out.println("Elements after sorting : " + Arrays.toString(arr));
        bubble(arr,4,0);
        System.out.println("Elements after sorting : " + Arrays.toString(arr));
    }
    public static void swap(int[] Arr,int a,int b){
        int temp=Arr[a];
        Arr[a]=Arr[b];
        Arr[b]=temp;
    }
    static void bubble(int[] arr, int r,int c){//using recursion
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }

}
