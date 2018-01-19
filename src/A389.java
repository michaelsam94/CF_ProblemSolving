
import java.util.Scanner;

public class A389 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        for (int i = 0; i < n - 1; i++)
            sum = gcd(sum, in.nextInt());
        System.out.println(sum * n);

    }

    static public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);

    }
}
