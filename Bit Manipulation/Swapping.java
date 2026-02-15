
public class Swapping {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("the values before swapping are:" + a + ", " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("the values after swapping are:" + a + ", " + b);

    }
}
