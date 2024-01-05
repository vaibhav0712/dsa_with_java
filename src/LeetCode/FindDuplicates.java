package LeetCode;
import java.util.Arrays;
import java.util.ArrayList;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println("Before: "+Arrays.toString(arr));
        System.out.println("After:" + find(arr));
    }
    static ArrayList<Integer> find(int[] arr){
        ArrayList<Integer> answers = new ArrayList<>();

        int i=0;
        //1. sort array using cyclic sort
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //2. loop through array to find duplicates
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){
                answers.add(arr[index]);
            }
        }
        return answers;
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
