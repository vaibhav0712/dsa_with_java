package LeetCode;

// https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        s = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        int r = 0;
        int l = s.length() - 1;
        while (r <= l) {
            if(s.charAt(r) != s.charAt(l)){
                return false;
            }
            r++;
            l--;
        }
        return true;
    }
}
