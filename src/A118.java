import java.util.Scanner;

public class A118  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s, n;
        s = input.next();
        StringBuilder sp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122
                    && s.charAt(i) != 'i' && s.charAt(i) != 'u'
                    && s.charAt(i) != 'o' && s.charAt(i) != 'y'
                    && s.charAt(i) != 'e' && s.charAt(i) != 'a') {
                sp.append('.');
                sp.append(s.charAt(i));
            }
            else if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90
                    && s.charAt(i) != 'I' && s.charAt(i) != 'U'
                    && s.charAt(i) != 'O' && s.charAt(i) != 'Y'
                    && s.charAt(i) != 'E' && s.charAt(i) != 'A') {
                int c = (int)s.charAt(i);
                c+=32;
                sp.append('.');
                sp.append((char)c);
            }
        }
        n = sp.toString();
        System.out.println(n);
    }
}
