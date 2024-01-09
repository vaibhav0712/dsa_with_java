package LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int num1) {
        if(num1 < 0){
            return false;
        }
        int num2 = reversNumber(num1);
        return num1 == num2;
    }
    static int reversNumber(int x){
        //1. reverse the number
        int y = 0;
        while(x!=0){
            y = y*10 + x%10;
            x = x/10;
        }
        return y;
    }
}
