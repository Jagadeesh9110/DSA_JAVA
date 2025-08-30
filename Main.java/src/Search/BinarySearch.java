package Search;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter th size of the array : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the target number : ");
        int tar=in.nextInt();
        boolean isFound=binary_search(arr,0,n-1,tar);
        System.out.println(isFound);
    }
    public static boolean binary_search(int[] Arr ,int start,int end, int target){

        if(Arr.length==0){
            return false;
        }
        while(start<=end){
        //    int mid=start+end/2;// might be possible if we gave large numbers it exceeds
            int mid=start+(end-start)/2;// this is the better way
            if(Arr[mid]==target){
                return true;
            }
            else if(Arr[mid]>target){
                end=mid-1;
            }
            else if(Arr[mid]<target){
                start=mid+1;
            }

        }
        return false;
}

}
