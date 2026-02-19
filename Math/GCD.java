
import java.util.Scanner;

public class GCD {

    public static int GCD(int n, int a, int b) {
        if(n==1) return 1;
        if (a % n == 0 && b % n == 0) {
            return n; 
        }else {
            return GCD(n - 1, a, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int meow = Math.min(n1, n2);
        for (int i = meow; i >= 1; i--) {

            if (n1 % i == 0 && n2 % i == 0) {
                System.out.printf("The GCD of %d and %d is %d", n1, n2, i);
                System.out.println("");
                break;
            }
        }
        System.out.println(GCD(meow,n1,n2));
    }
}
