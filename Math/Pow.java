
import java.util.Scanner;

public class Pow {

    public static double solve(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double ans = solve(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        }
        return ans * ans * x;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(1.0);
        }
        if (n < 0) {
            System.out.println(1 / solve(x, -n));
        } else {
            System.out.println(solve(x, n));
        }
    }
}
