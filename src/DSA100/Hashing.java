package DSA100;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int[] arr1 = {0,1,1,0,1,0,0};
        int sum = 5;
        sumSubArray(arr,sum);
    }
    // sub array for given sum
    static void sumSubArray(int[] arr,int sum){
        int start = 0;
        int end = -1;
        int currSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); // currSum:index
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum-sum == 0){
                end = i;
                break;
            }
            if(map.containsKey(currSum-sum)){
                start = map.get(currSum-sum)+1;
                end = i;
                break;
            }
            map.put(currSum,i);
        }
        // last condition
        if(end == -1){
            System.out.println("sum not found");
        }else{
            System.out.println("range : "+start+" "+end);
        }
    }
}
