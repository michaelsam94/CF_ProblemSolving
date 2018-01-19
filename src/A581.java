import java.util.Scanner;

public class A581 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int b, r;
        boolean isBlueOver = false;


        int sol1, sol2 = 0;

        r = input.nextInt();
        b = input.nextInt();


        sol1 = Math.min(r, b);

        if (sol1 == b) isBlueOver = true;

        if (isBlueOver) {
            if (r - sol1 >= 2) {
                sol2 += (r - sol1)/2;
            }
        } else {
            if (b - sol1 >= 2) sol2 += (b - sol1)/2;
        }


        System.out.println(sol1 + " " + sol2);


    }
}
