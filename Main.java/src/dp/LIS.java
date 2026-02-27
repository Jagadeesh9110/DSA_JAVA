package src.dp;

import java.util.Arrays;

public class LIS {
    private static int[][] dp;

    public static void main(String[] args) {
        // Given an array arr[] of size n, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e.,
        // the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.
        int[] arr = new int[]{1, 3, 7, 10, 4, 6, 5, 6, 8, 9};
        int n = arr.length;
        // it will take T:O(n^2) and S:O(n^2)
//        dp = new int[n][n + 1];
//        for(int[] row:dp){
//            Arrays.fill(row,-1);
//        }
     //   int val = helper(arr, 0, -1);
     //   System.out.println("Longest subsequence length: " + val);

        // we will take now as linear space.
//        int[] lis=new int[n];
//        Arrays.fill(lis,1);
//        int max=1;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                if(arr[j]<arr[i]){
//                    lis[i]=Math.max(lis[i],1+lis[j]);
//                }
//            }
//            max=Math.max(max,lis[i]);
//        }
//        System.out.println("Longest subsequence length : "+max);

        int[] tails=new int[n];
        int size=0;// currnet LIS length;
        for(int x:arr){
            int left=0;
            int right=size;
            while(left<right){
                int mid=left+(right-left)/2;
                if(tails[mid]<x){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }

            tails[left]=x;
            if(left==size){
                size++;
            }
        }

        System.out.println("O(n log n) LIS length : " + size);

    }

    // recusion
    private static int helper(int[] arr, int idx, int prevIdx) {
        if (idx == arr.length) {
            return 0;
        }
        if (dp[idx][prevIdx+1] != -1){
            return dp[idx][prevIdx+1];
        }
        int skip=helper(arr,idx+1,prevIdx);
        int take=0;
        if(prevIdx==-1 || (arr[idx]>arr[prevIdx])){
            take=1+helper(arr,idx+1,idx);
        }
        int max=Math.max(skip,take);
        dp[idx][prevIdx+1]=max;
       return max;
    }

}
