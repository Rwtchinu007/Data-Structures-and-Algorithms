
import java.util.Scanner;

public class Array01 {

    // In this fule we will shift 0s to the left and 1s to the right
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] != 0 && arr[i] != 1) {
                System.out.println("Invalid input");
                return;
            }
        }
        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        for(int k=0 ;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
