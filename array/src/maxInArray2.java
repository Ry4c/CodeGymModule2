import java.util.Scanner;

public class maxInArray2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 4, 6, 7},
                {3, 1, 5, 7, 8},
                {7, 0, 3, 7, 4}
        };
        System.out.println(findMax(numbers));
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (max < j) {
                    max = j;
                }
            }
        }
        return max;
    }
}
