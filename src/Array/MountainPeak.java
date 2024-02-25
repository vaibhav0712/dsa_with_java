//https://leetcode.com/problems/peak-index-in-a-mountain-array/
package Array;

public class MountainPeak {
    public static void main(String[] args){
        int[] arr = {0,1,2,5,7,8,12,9,6,4,3}; // {0,1,2,5,7,8,12,9,6,4,3}; -> 15
        int result = peakIndex(arr);
        System.out.println(result);
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in dec part of array
                // maybe answer but look at left side
                // this is why end != mid-1;
                end = mid;
            } else {
                // we are asc part of array
                // we know that mid+1 > mid
                start = mid + 1;
            }
        }
        // in last end == start
        return arr[start];
    }
}
