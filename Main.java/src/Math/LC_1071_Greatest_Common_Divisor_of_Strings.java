package src.Math;

public class LC_1071_Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {

    }
    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();

        // This will without TLE but we can do in less time complexity using the gcd .
        // Now i will check that if any atleast one character is exist only in one string(not in both) then the answer is empty.
//        boolean isExtraChar=false;
//        int[] f1=new int[26];
//        int[] f2=new int[26];
//        for(int i=0;i<n;i++){
//            char c=str1.charAt(i);
//            f1[c-'A']=1;// here we are marking the character exist.
//        }
//        for(int i=0;i<m;i++){
//            char c=str2.charAt(i);
//            f2[c-'A']=1;
//        }
//        for(int i=0;i<26;i++){
//            if(f1[i]!=f2[i]){
//                isExtraChar=true;
//                break;
//            }
//        }
//        if(isExtraChar){
//            return "";
//        }
//
//        String longer, shorter;
//        if(n>=m){
//            longer=str1;
//            shorter=str2;
//        }else{
//            longer=str2;
//            shorter=str1;
//        }
//        // Try all prefixes of the shorter string (longest first)
//        for (int len = shorter.length(); len >= 1; len--) {
//            String pattern = shorter.substring(0, len);
//            if (builds(pattern, shorter) && builds(pattern, longer)) {
//                return pattern;
//            }
//        }
//        return "";

        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int len = gcd(str1.length(), str2.length());
        return str1.substring(0,len);
    }
    private int gcd(int a ,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    private boolean builds(String p,String s){
        if(s.length()%p.length()!=0){
            return false;
        }
        int t=(s.length())/(p.length());
        StringBuilder str=new StringBuilder();
        for(int i=0;i<t;i++){
            str.append(p);
        }
        return str.toString().equals(s);
    }
}
