package LeetCode;

//https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;
import java.util.ArrayList;
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4}; // size n, element range 1-n
        System.out.println("Answer: "+findMismatchNumber(arr));
        System.out.println("Sorted: "+Arrays.toString(arr));
    }
    static ArrayList<Integer> findMismatchNumber(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        //1. sort array
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

        //2. loop through to find duplicates and true value
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                // found duplicated, return [duplicated,true]
                answer.add(arr[j]);
                answer.add(j+1);
            }
        }
        return answer;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
