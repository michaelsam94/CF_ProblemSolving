import java.util.Scanner;

public class A731 {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String x;
        int currnt = 97;
        int sol = 0;
        int asscii;

        x = in.next();

        for (char c : x.toCharArray()) {
            asscii = (int) c;

            if (asscii > currnt) {
                if (asscii - currnt > 13) {
                    sol += 26 - asscii + currnt;
                } else {
                    sol += asscii - currnt;
                }
            } else {
                if (currnt - asscii > 13) {
                    sol += 26 - currnt + asscii;
                } else {
                    sol += currnt - asscii;
                }
            }

            currnt = c;

        }

        System.out.println(sol);

    }

}
