package DSA100;

import java.util.ArrayList;
import java.util.Arrays;

public class Mathematics {
    public static void main(String[] args) {
        System.out.println("all prime in range : " + findAllPrime(10));
        System.out.println("gcd : " + gcd(14, 21));
        System.out.println("fast power : " + fastPower(2, 3));
        System.out.println("recursion power : " + recPow(2, 3));
    }

    static int recPow(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a * recPow(a, b - 1);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int fastPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = res * a;
            }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }

    static ArrayList<Integer> findAllPrime(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1]; //
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
