package LeetCode;
// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
//        int ans = majorityElement(arr);
        int ans = followUpl(arr);
        System.out.println("answer : "+ans);
    }
    static int majorityElement(int[] arr){
        int size = arr.length;
        int targetCount = size/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > targetCount){
                return key;
            }
        }
        return -1;
    }
    static int followUpl(int[] arr){
        int count = 1;
        int res = arr[0];

        for(int i=1; i<arr.length; i++){
            if(count == 0){
                res = arr[i];
            }
            count = (arr[i] == res) ? count+1 : count-1;
        }
        return res;
    }
}
