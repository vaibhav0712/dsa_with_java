package LeetCode;

// https://leetcode.com/problems/sort-colors/description/
import java.util.Arrays;
public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] nums) {
        int ones = 0;
        int zeros = 0;
        int twos = 0;
        // counting numbers
        for (int i : nums) {
            if (i == 0) {
                zeros++;
            } else if (i == 1) {
                ones++;
            } else {
                twos++;
            }
        }
        // overwriting nums array
        int currentIndex = 0;
        // fill zeros
        currentIndex = fillValue(nums, currentIndex, zeros, 0);
        // fill ones
        currentIndex = fillValue(nums, currentIndex, ones, 1);
        // fill twos
        currentIndex = fillValue(nums, currentIndex, twos, 2);
    }
    static int fillValue(int[] arr, int currentIndex, int count, int value) {
        // will run count number of times
        for (int j = 0; j < count; j++) {
            arr[currentIndex] = value;
            currentIndex++;
        }
        return currentIndex;
    }
}
