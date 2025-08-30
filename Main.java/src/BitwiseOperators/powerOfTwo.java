package BitwiseOperators;

public class powerOfTwo {
    public static void main(String[] args) {
        int n=14;// exception for n==0; fix it false to n==0
        boolean ans=(n&(n-1)) ==0;
        System.out.println(ans);
    }
}
