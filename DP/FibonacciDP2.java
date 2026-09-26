import java.util.Scanner;
public class FibonacciDP2{
    public static long fib(int n,long[]dp){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] dp = new long[n+1];
    System.out.println("Fibonacci of " + n + " is: " + fib(n, dp));
    }
}

// the above method is called bottom to top approach or tabulation method
// jo hmare recursion m base case hoti h wo hmare tabulation m starting point hoti h