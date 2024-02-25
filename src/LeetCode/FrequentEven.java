package LeetCode;

import java.util.HashMap;

public class FrequentEven {
    public static void main(String[] args) {
        HashMap<Integer,Integer> evenCount = new HashMap<>();
        int[] arr = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        for(int i:arr){
            if((i&1)==0){
                if(evenCount.containsKey(i)){
                    evenCount.put(i,evenCount.get(i)+1);
                }else{
                    evenCount.put(i,1);
                }
            }
        }
        System.out.println(evenCount);

        int max = -1;
        int res = -1;
        for(int key:evenCount.keySet()){
            int value = evenCount.get(key);
            if(max == value){
                // compare keys
                if(key < res){
                    res = key;
                }
            }
            if(value > max){
                max = value;
                res = key;
            }
        }
        System.out.println("answer : "+ res);
    }
}
