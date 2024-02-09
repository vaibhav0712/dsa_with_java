package LeetCode;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
public class sellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4}; // expected is 7
        int answer = maxProfit(arr);
        System.out.println(answer);
    }

    static int maxProfit(int[] arr) {
        int maxProfit = 0;
        if (arr.length < 2){
            return 0;
        }
        int l=0,r=1;
        while(r < arr.length){
            if(arr[r] > arr[l]){
                int profit = arr[r] - arr[l];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
