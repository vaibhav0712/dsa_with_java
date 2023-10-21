package Array;
public class Playground {
    public static void main(String[] args) {
        System.out.println("This is playground.");
    }

    //****** Reverse Number *******//
    static int reverse(int num) {
        if (num < 0) {
            num = num*-1;
        }
        int reversedNumber = 0;
        while(num>0){
            int digit = num%10;
            num = num/10;
            reversedNumber = reversedNumber*10+digit;
        }
        return reversedNumber;
    }
}