import java.util.Scanner;

public class B463 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int num;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < x; i++) {
            num = in.nextInt();
            if (num > max) max = num;
        }


        System.out.println(max);

    }
}

