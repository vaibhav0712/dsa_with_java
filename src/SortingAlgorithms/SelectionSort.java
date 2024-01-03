package SortingAlgorithms;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,0,2,1,1,8,0,21,4,2};
        System.out.println("Before: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After: "+ Arrays.toString(arr));

    }
    static void selectionSort(int[] arr){
        int size = arr.length;
        // find minimum element and move that element to start.
        // run outer loop n-1 times.
        for(int i=0; i<size-1; i++){
            int minIndex = i;
            int minValue = arr[i];
            for(int j=i+1; j<size; j++){
                if(arr[j] < minValue){
                    // update min index and value
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            // swap i with minimum value in list
            int temp = arr[i];
            arr[i] = minValue;
            arr[minIndex] = temp;
        }
    }

}
