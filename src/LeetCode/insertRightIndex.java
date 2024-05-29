package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/search-insert-position/description/
public class insertRightIndex {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6}; // {1,3,5,6}
        int target = 7; // target 7,2
        System.out.println(Arrays.toString(arr));
        System.out.println("Index  : " + searchIndex(arr,target));
    }
    static int searchIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            if(start >= arr.length){
                return end;
            }
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
