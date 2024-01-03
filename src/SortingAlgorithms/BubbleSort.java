package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10,0,2,1,1,8,0,21,4,2};
        System.out.println("Before: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        int arr_size = arr.length;
        // move the biggest element into last position

        // outer loop run n-1 for n elements
        for(int i=0; i<arr_size-1; i++){
            // do not run for n-1.
            // every iteration the last elements will be sorted.

            boolean swapped = false;
            for(int j=0; j<arr_size-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap j & j+1
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // break outer loop if no swapping is done.
            if(!swapped){
                break;
            }
        }
    }

}
