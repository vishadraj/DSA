/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 30-03-2022
 */

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println("findTheTargetInMatrix  = " + findTheTargetInMatrix(matrix, 6));
    }

    public static boolean findTheTargetInMatrix(int[][] givenMatrix, int target) {
        int left = 0;
        int right = givenMatrix[0].length - 1;
        while (left < givenMatrix.length && right >= 0) {
            if (givenMatrix[left][right] == target)
                return true;
            else if (givenMatrix[left][right] > target)
                right--;
            else if (givenMatrix[left][right] < target)
                left++;
        }
        return false;
    }
}
