import java.util.Scanner;

public class A350 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, m, num;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        n = input.nextInt();
        m = input.nextInt();


        for (int i = 0; i < n; i++) {
            num = input.nextInt();

            if (num > max) max = num;
            if (num < min) min = num;
        }

        max = Math.max(max,2 *min);


        for (int i = 0; i < m; i++) {
            num = input.nextInt();
            if (num <= max) max = -1;
        }

        if (max == -1) System.out.println(-1);
        else {
            System.out.println(max);
        }


    }
}
