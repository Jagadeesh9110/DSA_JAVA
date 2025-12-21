package Math;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
   public static void main(String[] args) {
         Maximum_Product_of_Three_Numbers obj=new Maximum_Product_of_Three_Numbers();
         int[] nums={-1,-2,-3};
         System.out.println(obj.maximumProduct(nums));
   }
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        if(n==3){
            return nums[0]*nums[1]*nums[2];
        }
        int noPos=0,noNeg=0;
        for(int val:nums){
            if(val<0){
                noNeg++;
            }else{
                noPos++;
            }
        }
       if((noPos>=3 && noNeg==0) || (noPos==0 && noNeg>=3)){
           Arrays.sort(nums);
           return nums[n-1]*nums[n-2]*nums[n-3];
        }else{
            Arrays.sort(nums);
            int val=Math.max(nums[n-1]*nums[0]*nums[1], nums[n-1]*nums[n-2]*nums[n-3]);
            return val;
        }
    }
}
