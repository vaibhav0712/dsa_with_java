package SortingAlgorithms;

import java.util.Arrays;

// outline
// 1. range of element should be 1-N (N is size of array)
// 2. time complexity is only O(n)
// 3. correct position of element is index = (value-1)
public class CyclicSort {
    public static void main(String[] args) {
       // int[] arr = {2,5,4,1,3}; // size 5 (for that element range 1 to 5)
        int[] arr = {5,4,3,2,1}; // size 5 (for that element range 1 to 5)
        System.out.println("Before : "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("After : "+ Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1; // correct index
            if(arr[i] != arr[correct]){
                // swap
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

}
