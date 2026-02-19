
import java.util.Scanner;

// we will use euclidean algo to find GCD of a number
public class Euclidean{
    public static int GCD(int n1,int n2){
        if(n1==n2) return n1;
        else if(n1>n2) return GCD(n1-n2, n2);
        else return GCD(n1, n2-n1);
    }
    public static int GCD2(int n1,int n2){
        if(n2==0) return n1;
        return GCD2(n2, n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1!=n2){
            if (n1>n2) n1-=n2;
            else n2-=n1;
        }
        System.out.println(n1);
        System.out.println(GCD(n1, n2));
        System.out.println(GCD2(n1, n2));

    }
}