
import java.util.*;

public class ISBN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ISBN number: ");
        long n = sc.nextLong();
        long original = n;
        int count = 0;
        long sum = 0;
        while(n>0){
            count++;
            n /= 10;
        }
        if(count!=10){
            System.out.println("Invalid ISBN number");
        }
        else{
           while(original>0){
                sum += original %10 *(count);
                original /= 10;
                count--;
            }
            if(sum % 11 == 0){
                System.out.println("Valid ISBN number");
            }
            else{
                System.out.println("Invalid ISBN number");
            }
        }
    }
}
