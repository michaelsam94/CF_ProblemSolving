import java.util.Scanner;

public class A617 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int sol=0;

        if (x <= 5) System.out.println(1);
        else {
            if(x % 5 > 0) sol++;
            sol += x/5;
            System.out.println(sol);
        }

    }
}
