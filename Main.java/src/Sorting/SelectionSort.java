package Sorting;
import java.util.Arrays;
import java.util.Scanner;

// selection sort is like we will select the element and place it correct index

public class SelectionSort {
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

        for(int i=0;i<n;i++){
            int last=n-i-1;
            int max=0;
            for(int j=0;j<=last;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            swap(arr,last,max);
        }
        System.out.println("Elements after sorting : " + Arrays.toString(arr));
    }
    public static void swap(int[] Arr,int a,int b){
        int temp=Arr[a];
        Arr[a]=Arr[b];
        Arr[b]=temp;
    }

}
