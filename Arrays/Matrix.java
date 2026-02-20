
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the length of inner array");
            int dimension = sc.nextInt();
            arr[i] = new int[dimension];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the value");
                arr[i][j] = sc.nextInt();                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");             
            }
            System.out.println("");
        }
    }
}
