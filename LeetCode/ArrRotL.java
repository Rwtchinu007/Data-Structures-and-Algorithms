import java.util.Scanner;
public class ArrRotL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot = sc.nextInt();
        if(rot > n){
         rot = rot % n;
        }
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int k=1;k<=rot;k++){
            int temp = arr[0];
            for(int i=1;i<n;i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}