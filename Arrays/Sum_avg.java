import java.util.Scanner;

public class Sum_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        int arr[] =new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float mean = (float)sum/size;
        System.out.println("Sum: "+ sum);
        System.out.printf("Mean: %.1f",mean);
    }
}
