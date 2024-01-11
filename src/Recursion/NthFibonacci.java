package Recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13
        int n = 6;
        int res = fib(n);
        System.out.println("Fibonacci number : "+res);
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
