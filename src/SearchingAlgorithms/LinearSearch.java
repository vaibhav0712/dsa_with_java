package SearchingAlgorithms;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        String name = "vaibhav";
        char target = 'h';

        int start = -1, end = 4;

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {8, 9, 0}};
        int target2D = 6;

        System.out.println(searchIn2D(arr, target2D));
        System.out.println(searchInString(name,target));
        System.out.println(searchInRange(name,target,start,end));
    }

    static boolean searchIn2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Index : " + row + " x " + col);
                    return true;
                }
            }
        }
//        for (int[] row : arr) {
//            for (int ele : row) {
//                if (ele == target) {
//                    return true;
//                }
//            }
//        }
        return false;
    }

    static boolean searchInString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    static boolean searchInRange(String name, char target, int start, int end) {
        if (start >= name.length() || end >= name.length() || start < 0 || end < 0) {
            System.out.println("Range is not valid.");
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
