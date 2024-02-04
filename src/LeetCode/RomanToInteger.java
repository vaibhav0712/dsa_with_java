package LeetCode;

import java.util.HashMap;

// https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s){
        int res = 0;
        HashMap<Character,Integer> ROMAN_VALUES = new HashMap<>();
        ROMAN_VALUES.put('I', 1);
        ROMAN_VALUES.put('V', 5);
        ROMAN_VALUES.put('X', 10);
        ROMAN_VALUES.put('L', 50);
        ROMAN_VALUES.put('C', 100);
        ROMAN_VALUES.put('D', 500);
        ROMAN_VALUES.put('M', 1000);

        for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && ROMAN_VALUES.get(s.charAt(i)) < ROMAN_VALUES.get(s.charAt(i+1))){
                res -= ROMAN_VALUES.get(s.charAt(i));
            }
            else{
                res += ROMAN_VALUES.get(s.charAt(i));
            }
        }
        return res;

    }
}
