package Array;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigit {
    public static void main(String[] args) {
        // goal : [1,44,789,1231,4] -> number with even digits = 2 (44 and 1231)
        int[] num = {-11, 44, 789, 1231, 4, 0, 1893, 11111, 90};
        int ans = countEven(num);
        System.out.println(ans);
    }

    static int countEven(int[] arr) {
        int count = 0;
        for (int e : arr) {
            if (countDigits2(e) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int countDigits2(int ele) {
        // converting negative to positive
        if (ele < 0) {
            ele = ele * -1;
        }
        // if zero return 1
        if (ele == 0) {
            return 1;
        }
        //
        return (int) (Math.log10(ele) + 1);
    }

    static int countDigits(int ele) {
        int count = 0;
        // converting negative number to positive
        if (ele < 0) {
            ele = ele * -1;
        }
        // handling zero
        if (ele == 0) {
            return 1;
        }
        // other cases
        while (ele > 0) {
            ele = ele / 10;
            count++;
        }
        return count;
    }
}
