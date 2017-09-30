import java.util.Scanner;

public class A266 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sol = 0;
        char prevChar,currChar;

        String colors = in.next();

        prevChar = colors.charAt(0);

        for (int i=1; i < n; i++){
            currChar = colors.charAt(i);

            if(prevChar == currChar) sol++;
            prevChar = currChar;
        }

        System.out.println(sol);

    }
}
