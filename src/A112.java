import java.util.Scanner;

public class A112 {

    public static void main(String[] args) {
        String f, s;
        Scanner input = new Scanner(System.in);
        f = input.next();
        s = input.next();
        int fn, sn, resn;
        int res1 = 0;
        for (int i = 0; i < f.length(); i++) {
            fn = (int) f.charAt(i);
            sn = (int) s.charAt(i);
            if (fn < 97)
                fn += 32;
            if (sn < 97)
                sn += 32;
            if (fn != sn) {
                res1 = fn - sn;
                break;
            }
        }
        if (res1 < 0)
            System.out.println("-1");
        else if (res1 > 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
