package LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/?envType=study-plan-v2&envId=top-interview-150
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15}; // hashmap  = {}
        int target = 9;

        // using hashmap
        HashMap<Integer,Integer> hashArr = new HashMap<>(); // key:arr_value, value:arr_index

        for(int i=0; i<arr.length; i++){
            int second = target-arr[i];
            if(hashArr.containsKey(second)){
                System.out.println("Found at index : " +  i +  " " + hashArr.get(second));
            }else{
                // add into hashmap
                hashArr.put(arr[i],i);
            }
        }
    }
}
