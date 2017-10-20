import java.util.Scanner;

public class A742 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int x = input.nextInt();

        if (x == 0) {
            System.out.println(1);
        } else if (x % 4 == 2) {
            System.out.println(4);
        } else if (x % 4 == 3) {
            System.out.println(2);
        } else if (x % 4 == 0) {
            System.out.println(6);
        } else if (x % 4 == 1) {
            System.out.println(8);
        }

    }
}
