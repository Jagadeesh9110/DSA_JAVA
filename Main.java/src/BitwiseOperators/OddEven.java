package BitwiseOperators;

public class OddEven {
    public static void main(String[] args) {
        int n=87;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n&1) ==1;// this will confirm whether the given number is odd or even
    }

}
