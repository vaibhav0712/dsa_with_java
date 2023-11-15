// https://leetcode.com/problems/search-in-rotated-sorted-array/
package Array;

import javax.xml.stream.events.StartDocument;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int answer = searchInArray(arr, target);
        System.out.println("index: " + answer);
    }

    static int searchInArray(int[] arr, int target) {
        // 1. find pivot element (pivot : biggest element in array)
        // 2. apply binary search on both side of pivot element
        int pivot = findPivot(arr);

        // array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // below code is use instead of (start+end)/2 because of integer storage issue for large number
            // both are same but in different formats
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // all the element after mid is sorted, no need to check that side
            // because if arr[start] is bigger than mid
            // else check on right side of mid
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
