package Math;

import java.util.HashMap;

public class Continuous_Subarray_Sum{
    public static void main(String[] args) {
        Continuous_Subarray_Sum obj=new Continuous_Subarray_Sum();
        int[] nums={23,2,4,6,7};
        int k=6;
        System.out.println( obj.checkSubarraySum(nums, k));
    }
     public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        // This will give the TLE
        // boolean hasGood=false; 
        // for(int i=0;i<n-1;i++){
        //     long sum=nums[i];
        //   for(int j=i+1;j<n;j++){
        //      sum+=nums[j];
        //      if(sum%k==0){
        //         hasGood=true;
        //         break;
        //      }
        //   }
        // }
        // return hasGood;
        int[] prefixSum=new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, -1);
        for(int i=0;i<n;i++){
            int cur=prefixSum[i]%k;
            map.putIfAbsent(cur,i);
        }
        for(int i=0;i<n;i++){
            int cur=prefixSum[i]%k;
            if(map.containsKey(cur) ){
                if((i-map.get(cur))>=2){
                    return true;
                }
            }
        }
     return false;
    }
}