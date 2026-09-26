
import java.util.Scanner;

public class FibonacciDP1 {

    public static long fib(int n, long[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = fib(n - 1,dp) + fib(n - 2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        long ans = fib(n, dp);
        System.out.println("Fibonacci of " + n + " is: " + ans);

    }
}


