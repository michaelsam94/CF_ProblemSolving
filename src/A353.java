import java.util.Scanner;

public class A353 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, num1, num2;
        int left = 0, right = 0;
        int sol = 0;

        n = input.nextInt();


        for (int i = 0; i < n; i++) {
            num1 = input.nextInt();
            num2 = input.nextInt();
            if (num1 % 2 != num2 % 2) sol++;
            left += num1;
            right += num2;

        }

        if (left % 2 == 0 && right % 2 == 0) System.out.println(0);
        else if (sol % 2 == 0 && sol > 0) System.out.println(1);
        else System.out.println(-1);


    }
}
