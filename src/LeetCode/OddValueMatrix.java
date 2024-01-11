package LeetCode;
import java.util.Arrays;
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
public class OddValueMatrix {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m = 2;
        int n = 3;
        int ans = oddCells(m,n,indices);
        System.out.println("odd cell count : "+ans);
    }
    static int oddCells(int m, int n, int[][] indices) {
        // m x n matrix assign with zeros
        int[][] matrix = new int[m][n];

        for (int[] index : indices) {
            // row x col need to increment
            int rowToIncrement = index[0];
            int colToIncrement = index[1];

            // Increment all the elements in row
            for (int col = 0; col < matrix[rowToIncrement].length; col++) {
                matrix[rowToIncrement][col]++;
            }

            // Increment all the elements in col
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][colToIncrement]++;
            }
        }

        //find number of odd cells
        int oddCellsCount = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 != 0) {
                    oddCellsCount++;
                }
            }
        }
        return oddCellsCount;
    }
}
