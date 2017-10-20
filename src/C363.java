import java.util.Scanner;
import java.util.Stack;


// TODO: 14-Oct-17 solve C363 
public class C363 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x = input.next();
        StringBuilder sb = new StringBuilder(x);

        int numOfSimlarAdgecentChars = 0;

        int i = 0;
        char prev = sb.charAt(0);
        for (char c : x.toCharArray()) {
            if (i >= 2) {
                
            } else if (i > 3) {

            }
            prev = c;
            i++;
        }


        StringBuilder sb1 = new StringBuilder();
        for (i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '-') sb1.append(sb.charAt(i));
        }


        System.out.println(sb1.toString());

    }

}

