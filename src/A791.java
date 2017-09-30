import java.util.Scanner;

public class A791 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, sol = 0;

        a = in.nextInt();
        b = in.nextInt();


        int i = 0;
        do {
            i++;
            a = 3 * a;
            b = 2 * b;

        } while (a <= b );

        System.out.println(i);
    }
}
