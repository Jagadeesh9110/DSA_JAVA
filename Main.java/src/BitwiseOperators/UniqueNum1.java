package BitwiseOperators;

public class UniqueNum1 {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,4,4,4};
        int k=3;
        System.out.println("The number that appears only once is: " + findSingle(arr, k));
    }
    public static int findSingle(int[] nums, int k) {
        int[] bitCounts = new int[32]; // To count bits for a 32-bit integer

        // Count the number of times each bit is set
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCounts[i]++;
                }
            }
        }

        int result = 0;

        // Reconstruct the single number from the bits that are not divisible by k
        for (int i = 0; i < 32; i++) {
            if (bitCounts[i] % k != 0) {
                result |= (1 << i);
            }
        }

        return result; // The unique number
    }
}
