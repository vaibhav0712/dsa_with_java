package Array;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 5, 5, 5, 7, 7, 8, 8, 10 };
        int target = 5;
        int[] result = new int[2];
        result[0] = findIndex(arr, target, true);
        result[1] = findIndex(arr, target, false);
        System.out.println(Arrays.toString(result));

    }

    static int findIndex(int[] arr, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (startIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
