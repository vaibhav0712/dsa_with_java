package LeetCode;
import java.util.ArrayList;
import java.util.Arrays;


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,2,8,7,3,4,3,1}; // range is 1-n where n = size
        System.out.println(Arrays.toString(arr));
        findAllMissing(arr);

    }
    static void findAllMissing(int[] nums){

        ArrayList<Integer> answers = new ArrayList<>();

        //1. sort array using cyclic sort
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1; // bcz range is 1-n
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //2. loop through and find element with wrong index or not present
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                answers.add(j+1);
            }
        }

        System.out.println(answers);
    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
