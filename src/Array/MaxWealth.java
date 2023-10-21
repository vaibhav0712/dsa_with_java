package Array;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5},{1,2,9}};
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int maxValue = Integer.MIN_VALUE;
        for(int[] row:arr){
            int wealth = 0;
            for(int ele:row){
                wealth = wealth + ele;
            }
            if(wealth > maxValue){
                maxValue = wealth;
            }
        }
        return maxValue;
    }

}
