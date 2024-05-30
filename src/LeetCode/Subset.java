package LeetCode;
import java.util.*;
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3}; // {0}
        // return arraylist
        findSubsets(arr);
    }
    static void findSubsets(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // start with the empty subset

        for (int num : arr) {
            int size = result.size();
            System.out.println("size: "+size);
            for (int i = 0; i < size; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
//                System.out.println("get: "+newSubset);
                newSubset.add(num);
//                System.out.println("add: "+newSubset);
                result.add(newSubset);
            }
        }
        System.out.println(result);
    }
}
