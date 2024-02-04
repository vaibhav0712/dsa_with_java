package LeetCode;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 2147395599;
        System.out.println("square root of "+n+" is "+squareRoot(n));
    }
 // 0,1,2,3,4,5,6,7,8
    static int squareRoot(int n) {
        long start = 0, end = n;

        while (start <= end) {
            long mid = (start + (end - start) / 2);
            if (mid * mid == n) {
                return (int)mid;
            } else if (mid * mid > n) {
                // search on left side
                end = mid-1;
            }
            else{
                // search on right side
                start = mid+1;
            }
        }
        return (int)start-1;
    }
}
