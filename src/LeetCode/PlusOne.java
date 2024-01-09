package LeetCode;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


//https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,9};
        int[] arr1 = {9,0,9};
        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solution(int[] arr) {
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            // increment by +1
            arr[i]++;

            // if digit becomes 10, set it to zero and continue with next digit
            if(arr[i] == 10){
                arr[i] = 0;
            }
            else{
                return arr;
            }
        }
        // If we are here, it means all digits became 0, we need to carry forward
        int[] result = new int[n+1];
        result[0] = 1;
        return result;
    }
}
