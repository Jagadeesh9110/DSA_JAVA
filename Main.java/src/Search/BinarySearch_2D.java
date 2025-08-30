package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Matrix: ");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        int[] result = SortedSearch(arr, 9);
        if (result[0] == -1) {
            System.out.println("Target element not found.");
        } else {
            System.out.println("Target found at: " + Arrays.toString(result));
        }
    }

    // Search in the row provided between the columns provided
    public static int[] BinarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    // Binary search in a sorted matrix
    public static int[] SortedSearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return BinarySearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0, rEnd = rows - 1, cMid = cols / 2;

        // Run the loop till two rows are remaining
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Check middle column of two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in four quadrants
        if (target <= matrix[rStart][cMid - 1]) {
            return BinarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return BinarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return BinarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart + 1][cMid + 1]) {
            return BinarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}
