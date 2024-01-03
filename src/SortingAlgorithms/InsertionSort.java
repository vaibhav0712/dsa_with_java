package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10,0,2,1,1,8,0,21,4,2};
        System.out.println("Before: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        int size = arr.length;
        // we assume that first element is sorted and start with index 1.
        // select key and put it to its right position on left side.

        // outer loop will run n-1 times, but including last index, ignoring first
        for(int i=1; i<size; i++){
            int key = arr[i];
            int j = i;
            while(j > 0 && key < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

}
