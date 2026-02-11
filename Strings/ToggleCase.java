
import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                ans = ans + (char)(ascii);
            } else {
                ascii -= 32;
                ans = ans + (char)(ascii);
            }
        }
        System.out.println(ans);
    }
}
