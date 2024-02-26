package DSA100;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5};
        int[] arr1 = {0,1,1,0,1,0,0};
        int sum = 5;
//        sumSubArray(arr,sum);
        countDistinct();
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

    // count distinct element in k size window
    static void countDistinct(){
        int[] arr = {1,2,2,1,3,1,1,3};
        int k = 4;
        // use hash map for evey windoe
        HashMap<Integer,Integer> map = new HashMap<>();

        // for first window - it is easy
        for(int i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map.size());
        // for rest of the windows
        for(int i=k; i<arr.length; i++){
            // move window and remove first element of prv window
            // if the count is 1 means remove that element from new window
            if(map.get(arr[i-k]) == 1){
                map.remove(arr[i-k]);
            }else{
                map.put(arr[i-k],map.get(arr[i-k])-1);
            }
            // we only need to enter last element of window like ith element
            // because the hashmap already contains other 3 prv elments
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            System.out.println(map.size());
        }
    }
}
