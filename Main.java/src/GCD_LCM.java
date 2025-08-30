public class GCD_LCM {
    public static void main(String[] args) {
        int a=10;
        int b=25;
        System.out.println( gcd(a,b));
        System.out.println(lcm(a,b));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

}
