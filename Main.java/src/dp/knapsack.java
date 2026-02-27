package src.dp;

import java.util.Arrays;

public class knapsack {
   static int[][] dp;
    public static void main(String[] args) {
        /*
        * Given two arrays, profit[] and weight[], where each element represents the profit and weight of an item respectively,
        * also given an integer W representing the maximum capacity of the knapsack (the total weight it can hold).
        * Put the items into the knapsack such that the sum of profits associated with them is the maximum possible, without exceeding the capacity W.
        */
        int[] profit=new int[]{1,2,3};
        int[] weight=new int[]{4,5,1};
        int W=4;
        int n=profit.length;
        // this is memoization
//        dp=new int[n][W+1];
//        for(int[] row:dp){
//            Arrays.fill(row,-1);
//        }
//        int res=helper(profit,weight,0,W);
//        System.out.println("Max profit : "+res);

        // tabulation one
        dp=new int[n+1][W+1];

        for(int i=1;i<=n;i++){
            for(int j=0;j<=W;j++){
               dp[i][j]=dp[i-1][j];
                if(weight[i-1]<=j){
                    dp[i][j]=Math.max(dp[i][j],profit[i-1]+dp[i-1][j-weight[i-1]]);
                }
            }
        }
        int res= dp[n][W];
        System.out.println("Max profit : "+res);
    }
    private static int helper(int[] profit,int[] weight,int idx,int rem){
        if(rem==0){
            return 0;
        }
        if(idx>=weight.length){
            return 0;
        }
        if(dp[idx][rem]!=-1){
            return dp[idx][rem];
        }
        int max=helper(profit,weight,idx+1,rem);
        if(weight[idx] <=rem){
            max=Math.max(max,profit[idx]+helper(profit,weight,idx+1,rem-weight[idx]));
        }
        dp[idx][rem]=max;
        return max;
    }
}
