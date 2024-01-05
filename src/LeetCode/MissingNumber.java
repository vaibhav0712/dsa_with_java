package LeetCode;

// https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3}; // missing is 2
        int ans = findMissing(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
    static int findMissing(int[] arr){
        // 1.sort 0 to n-1 elements
        int i=0;
        while(i < arr.length){
            int correct = arr[i];
            // we will sort all element except from n
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
        // 2. search in sorted array to find missing number
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j){
                return j;
            }
        }
        // if element n is missing we can't check from loop
        // if loop does not return anything it means the last element missing
        // the last element is n which is equal to size of array
        return arr.length; // last element
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
