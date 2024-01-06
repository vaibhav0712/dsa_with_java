package LeetCode;
// https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2}; // given size n+1, element range is 1-n
        int answer = find(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Answer: "+answer);
    }
    static int find(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        // after the array is sorted.
        // bcz of size n+1 the last element will always be duplicated value.
        return arr[arr.length-1];
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
