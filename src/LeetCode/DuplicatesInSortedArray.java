package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class DuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Before : " + Arrays.toString(arr));
        int answer = removeDuplicates(arr);
        System.out.println("After : " + Arrays.toString(arr));
        System.out.println("Answer : "+answer);
    }
    static int removeDuplicate(int[] arr){

        int n = arr.length;
        // If the array is empty or has only one element, there are no duplicates
        if (n <= 1) {
            return n;
        }

        int uniqueCounter = 2;

        for (int i = 2; i < n; i++) {
            // If the current element is different from the previous one, update the array
            if (arr[i] != arr[uniqueCounter-2]) {
                arr[uniqueCounter++] = arr[i];
            }
        }

        return  uniqueCounter;
    }
    static int removeDuplicates(int[] arr){
        int size = arr.length;
        // {1,1,2,2,2,3,3} -> {1,1,2,2,3,3}
        int q = 2;
        for(int i=2; i<size; i++){
            if(arr[i] != arr[q-2]){
                arr[q] = arr[i];
                q++;
            }
        }
        return -1;

    }
}
