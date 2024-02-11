package DSA100;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        // allSubset("aba",0,"");
        // Permutations
        permutations("abc".toCharArray(),0);
    }
    static void permutations(char[] ar,int fi){
        if(fi == ar.length-1){
            System.out.println(Arrays.toString(ar));
        }
        for(int i=fi; i<=ar.length-1; i++){
            swap(ar,fi,i);
            permutations(ar,fi+1);
            swap(ar,fi,i);
        }
    }
    static void swap(char[] ar,int i,int j){
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // To understand create tree structure
    static void allSubset(String s,int i, String cur){
        if(i == s.length()){
            System.out.println("-> : "+cur);
            return;
        }
        allSubset(s,i+1, cur+s.charAt(i));
        allSubset(s,i+1,cur);
    }
}
