import java.util.Scanner;

public class Prime_fact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("No prime factors");
            return;
        }

        int copy = n;
        int i = 2;

        while (i * i <= copy) {
            if (copy % i == 0) {
                System.out.println(i);
                copy /= i;
            } else {
                i++;
            }
        }

        
        if (copy > 1) {
            System.out.println(copy);
        }
    }
}
// Time complexity: O(sqrt(n))

