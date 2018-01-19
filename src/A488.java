import java.util.Scanner;

public class A488 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        while(("" + (n + b)).indexOf("8") == -1)
            b++;
        System.out.println(b);

    }
}
