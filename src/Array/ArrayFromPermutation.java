package Array;
import java.util.Arrays;
//https://leetcode.com/problems/build-array-from-permutation/description/
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4}; // expected : 0,1,2,4,5,3
        int[] result = fromPermutation(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] fromPermutation(int[] arr){
        int[] newArray = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArray[i] = arr[arr[i]];
        }
        return newArray;
    }
}
