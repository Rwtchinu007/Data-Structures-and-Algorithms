
import java.util.Scanner;

public class capitaliseProb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String ans = "";
        for (String wrd : arr) {
            if (wrd.length() == 1) {
                ans += Character.toUpperCase(wrd.charAt(0)) + " ";
            } else {

                char first = Character.toUpperCase(wrd.charAt(0));
                String mid = wrd.substring(1, wrd.length() - 1);
                char last = Character.toUpperCase(wrd.charAt(wrd.length() - 1));
                ans = ans + (first + mid + last) + " ";
            }

        }
        System.out.println(ans);
    }
}
