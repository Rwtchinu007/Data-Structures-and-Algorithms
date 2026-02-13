
import java.util.*;

public class Automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sq = n * n;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        if (sq % Math.pow(10, count) == original) {
            System.out.println("Automorphic Number"); 
        }else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
