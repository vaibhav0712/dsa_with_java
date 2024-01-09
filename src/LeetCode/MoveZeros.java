package LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/description/
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Before: "+ Arrays.toString(arr));
        moveZeroes1(arr);
        System.out.println("After: "+Arrays.toString(arr));
    }
    static void moveZeroes1(int[] arr) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining elements with zeroes
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
    static void moveZeros(int[] arr){
        int counter = 0;
        int size = arr.length;

        for(int i=0; i<size; i++){
            while(arr[i] == 0 && i< size-counter){
                counter++;
                // move left element to right side
                for(int j=i; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
            }
        }
        int start = size-counter;
        int end = size-1;
        while(start <= end){
            arr[start] = 0;
            start++;
        }

    }


}
