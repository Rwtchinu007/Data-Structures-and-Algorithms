
import java.util.Arrays;
import java.util.Scanner;

public class Seive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(arr[i]) count++;
        }
        System.out.println(count);
    }
}