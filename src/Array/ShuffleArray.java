package Array;
import java.util.Arrays;
// https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8};
        int n = 3;
        int[] result = shuffle(arr,n);
        System.out.println(Arrays.toString(result));
    }
    static int[] shuffle(int[] arr,int n){
        int[] newArr = new int[arr.length];
        for(int i=0;i<n;i++){
            newArr[i+i] = arr[i];
            newArr[i+i+1] = arr[i+n];
        }
        return newArr;
    }
}
