import java.util.Scanner;

public class S_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        if (size < 2) {
            System.out.println("Second greatest element not possible");
            return;
        }

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Math.max(arr[0], arr[1]);
        int s_max = Math.min(arr[0], arr[1]);

        for (int i = 2; i < size; i++) {
            if (arr[i] > max) {
                s_max = max;
                max = arr[i];
            } else if (arr[i] > s_max && arr[i] != max) {
                s_max = arr[i];
            }
        }

        if (max == s_max) {
            System.out.println("Second greatest element does not exist");
        } else {
            System.out.println("Second greatest element = " + s_max);
        }
    }
}
// to do it with out Math function we will assign int s_max =Integer.MIN_VALUE;
