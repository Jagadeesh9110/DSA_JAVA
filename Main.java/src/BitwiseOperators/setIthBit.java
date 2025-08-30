package BitwiseOperators;

public class setIthBit {
    public static void main(String[] args) {
        int a=56;
        int i=3;
        System.out.println(setBit(a,i));
    }
    public static int setBit(int n, int i){
        return (n|(1<<(i-1)));
    }
}
