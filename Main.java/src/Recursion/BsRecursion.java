package Recursion;

public class BsRecursion {
    public static void main(String[] args) {
        int[] Arr={2,3,4,5,6};
        System.out.println( search(Arr,4,0,Arr.length-1));

    }
    public static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            return search(arr,target,s,m-1);// make sure a return of function call of the return type
        }
        return search(arr,target,m+1,e);
    }
}
