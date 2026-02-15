
import java.util.Scanner;

class Solution {
    public boolean isPowOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
public class Pow2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        System.err.println(sol.isPowOfTwo(n));
    }
}