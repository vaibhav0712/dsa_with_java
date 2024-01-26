package LeetCode;
//https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 0, 0, 0, 0, 0}; //(m)  size m+n
        int[] arr2 = {1, 2, 3, 5, 6}; //(n) size n
        int m = 1, n = 5;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int last = m + n - 1; // point at last index of arr1
        while (m > 0 && n > 0) {
            if(arr1[m-1] < arr2[n-1]){
                arr1[last] = arr2[n-1];
                n -= 1;
            }
            else{
                arr1[last] = arr1[m-1];
                m -= 1;
            }
            last -= 1;
        }
        // fill out leftover of arr2 into arr1
        while(n > 0){
            arr1[last] = arr2[n-1];
            n -= 1;
            last -= 1;
        }
    }
}
