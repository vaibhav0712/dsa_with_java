package Array;

import java.sql.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class Playground {
    public static void main(String[] args) {
        System.out.println("This is playground.");
        int[] arr = {4, 3, 2, 1}; // {4321+1=4322}
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // {99+1=100}
        System.out.println("question: " + Arrays.toString(arr2));
        System.out.println("answer: " + Arrays.toString(onePlus(arr2)));
    }

    //****** Reverse Number *******//
    static int reverse(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }


    // *** something
    static int[] onePlus(int[] arr) {
        long number = 0;
        for (int ele : arr) {
            number = number * 10 + ele;
        }
        number += 1;
        int len = (int) Math.log10(number) + 1;
        int[] result = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            long digit = number % 10;
            result[i] = (int)digit;
            number = number / 10;
        }
        return result;
    }
}