
import java.util.Scanner;

public class ArrRotR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot = sc.nextInt();
        rot = rot % n;
        int arr[] = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = sc.nextInt();
        }
        for (int i = 0; i < rot; i++) {
            int temp = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");

        }
    }
}
