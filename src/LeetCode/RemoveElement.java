package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
//        int[] arr = {1};
        int key = 0;
        int answer = removeElement(arr,key);
        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
    }
    static int removeElement(int[] arr,int key){
        int counter = 0;
        int size = arr.length;
        // if less than one element return n
        if(size<1){
            return size;
        }
        for(int i=0; i<size; i++){
            while(arr[i] == key && i< size-counter){
                counter++;
                // move left element to right side
                for(int j=i; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
            }
        }
        return size-counter;
    }
}
