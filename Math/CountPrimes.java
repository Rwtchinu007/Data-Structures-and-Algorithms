
import java.util.Scanner;

public class CountPrimes{
     public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();
         int count = 0;
        for (int i = 2; i < range; i++) {
            if (isPrime(i))
                count++;
        }
      System.out.println(count);

    }
}