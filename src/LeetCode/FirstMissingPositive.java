package LeetCode;
import java.util.Arrays;
//https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(Arrays.toString(arr));
        int ans = firstMissingPositive(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("First missing positive element : "+ans);
    }
    static int firstMissingPositive(int[] arr){
        // case 1: if number is -ve ignore don't apply swap operation
        // case 2: if number is > n ignore don't apply swap operation
        // traverse through sorted array and find first invalid element with index
        // if not found anything return n+1 element which is not present in array

        //1. sort array using cyclic sort
        int i=0;
        int n = arr.length;
        while(i < n){
            int correct = arr[i]-1;
            if(arr[i] < n && arr[i] > 0 && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        //2. find first invalid element at index by traversing through array
        // if not found invalid element at index return n+1 which is the smallest positive not in array
        for(int j=0; j<n; j++){
            if(arr[j] != j+1){
                // incorrect element at index, means the element in not present
                return j+1;
            }
        }
        return n+1;
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
