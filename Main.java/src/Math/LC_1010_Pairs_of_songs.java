package src.Math;

import java.util.HashMap;

public class LC_1010_Pairs_of_songs {
    public static void main(String[] args) {

    }
    public int numPairsDivisibleBy60(int[] time) {
        int n=time.length;
        int res=0;
        // this will give TlE
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((time[i]+time[j])%60==0){
        //             res++;
        //         }
        //     }
        // }

        int[] count=new int[60];
        for(int i=0;i<n;i++){
            int rem=time[i]%60;
            int idx=(60-rem)%60;
            res+=count[idx];
            count[rem]++;
        }
        return res;
    }
}
