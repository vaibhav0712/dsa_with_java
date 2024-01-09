package LeetCode;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class IsPangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        String s1 = "vaibhav";
        System.out.println("Is pangram? : " + isStringPangram(s1));
    }
    static boolean isStringPangram(String s){
        // string which contain all the 26 letter
        int size = s.length();
        char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int counter = 0;
        for(char i:arr){
            int index = 0;
            while(index < size){
                if(s.charAt(index) == i){
                    counter++;
                    break;
                }
                index++;
            }
        }
       return  counter == 26;
    }
}

