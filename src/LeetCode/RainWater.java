package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class RainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("water : "+solution(arr));
    }
    static int solution(int[] arr){
        int size = arr.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] = arr[0];
        rightMax[size-1] = arr[size-1];

        for(int i=1; i<size; i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        for(int j=size-2; j >= 0; j--){
            rightMax[j] = Math.max(arr[j],rightMax[j+1]);
        }

        int water = 0;
        for(int i=0; i<size; i++){
            water += Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        return water;
    }
}
