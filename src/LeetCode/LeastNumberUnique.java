package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class LeastNumberUnique {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 1, 3, 3, 2};
        int k = 3;
        int ans = solution(arr, k);
    }

    static int solution(int[] arr, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        System.out.println(freq);

        // sort the hashMap
        ArrayList<Integer> sortValues = new ArrayList<>(freq.values());
        Collections.sort(sortValues);
        System.out.println(sortValues);

        for (int i = 0; i < sortValues.size(); i++) {
            if (k == 0) {
                break;
            }
            System.out.println(sortValues.get(i));
        }

        return -1;
    }
}
