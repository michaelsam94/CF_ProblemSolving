import java.util.Scanner;

public class A486 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();


        long sol = x%2==0? x/2 : (0-((x/2)+1));

        System.out.println(sol);

    }
}
