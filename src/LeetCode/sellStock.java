package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
public class sellStock {
    public static void main(String[] args) {
        int[] arr = {7};
        int answer = maxProfit(arr);
        System.out.println(answer);
    }

    static int maxProfit(int[] arr) {
        if (arr.length < 2){
            return 0;
        }
        int[] profit = new int[arr.length - 1]; // n-1 size
        for (int i = 0; i < arr.length - 1; i++) {
            int maxProfit = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                int currProfit = arr[j] - arr[i];
                maxProfit = Math.max(currProfit, maxProfit);
            }
            profit[i] = Math.max(maxProfit, 0);
        }
        // find max value from given profit array
        System.out.println(Arrays.toString(profit));
        int ans = Integer.MIN_VALUE;
        for (int i : profit) {
            ans = Math.max(i, ans);
        }
        return ans;
    }
}
