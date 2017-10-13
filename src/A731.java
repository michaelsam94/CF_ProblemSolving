import java.util.Scanner;

public class A731 {


    //todo A. Night at the Museum
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x;
        int currnt = 97;
        int diff;
        int sol = 0;
        int asscii;

        x = in.next();

        for (char c : x.toCharArray()){
            asscii = (int) c;
            sol += Math.min(Math.abs(asscii - currnt),Math.abs((currnt - asscii)) % 26);
            System.out.println((asscii - currnt) % 26);
            currnt = c;
        }

        System.out.println(sol);

    }

}
