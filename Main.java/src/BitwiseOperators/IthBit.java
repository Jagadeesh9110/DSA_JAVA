package BitwiseOperators;

// Find the ith bit of a number

public class IthBit {
    public static void main(String[] args) {
        int a=56;
        int i=4;
        System.out.println(ithBit(a,i));
    }
    public static int ithBit(int n,int i){
        return (n&(1<<(i-1)))!=0 ? 1:0;
    }
}

// we can have the another problem which is set ith bit to 1
// we can solve the above problem using the or operator with mask to that number

// there will be another question like this which is reset ith bit