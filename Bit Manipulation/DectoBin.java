
import java.util.Scanner;

public class DectoBin{
    public static int BinarytoDecimal(int n){
        int count = 0;
        int decimal = 0;
        while(n>0){
            int bit = n%10;
            decimal += bit*Math.pow(2,count);
            count ++;
            n/=10; 
        }

        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        String ans = "";
        while(n>0){
            int bit = n%2;
           ans = bit + ans;
            n/=2;
        }
        System.out.println(ans);

        // now we will check binary to decimal
        System.out.println(BinarytoDecimal(1111));
        // Bitwise and operator
        System.out.println(9&5);
        // Bitwise or operator
        System.out.println(9|5);
        // Bitwise xor operator
        System.out.println(9^5);
        // right shift
        System.out.println(25>>3);
        // left shift
        System.out.println(25<<2);
        // complement
        System.out.println(~14); //-(n+1)
    }
}