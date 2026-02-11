
import java.util.Arrays;
import java.util.Scanner;

public class charCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int arr[] = new int[128];
        Arrays.fill(arr, 0);
        for (int idx = 0; idx < str.length(); idx++) {
            int ascii = (int) (str.charAt(idx));
            arr[ascii] += 1;
        }
        for (int idx = 0; idx < arr.length; idx++) {
            if(arr[idx]>0){
                System.out.printf("%c -> %d\n",(char)idx,arr[idx]);
            }
            
        }
    }
}