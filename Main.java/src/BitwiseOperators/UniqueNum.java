package BitwiseOperators;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,5,4,6,5};
        System.out.println(Answer(arr));
    }

    private static int  Answer(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }

        return unique;
    }
}
