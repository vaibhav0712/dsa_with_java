package LeetCode;
//https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6}; // {6,5,4,3,2,1,0}
        int shift = 3;
        rotateArray(arr,shift);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int[] arr,int shift){
        int size = arr.length;
        //1. reverse array complete array
        reverse(arr,0,arr.length-1);
        //2. again reverse the parts of the array separated by shift
        // 0-k and k-size
        reverse(arr,0,shift-1);
        reverse(arr,shift,arr.length-1);
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            // swap both element
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // increment start and decrement end
            start++;
            end--;
        }
    }
}

