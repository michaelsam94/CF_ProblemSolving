import java.util.Scanner;

public class A766 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a,b;

        a = input.next();
        b = input.next();


        if(a.length() > b.length()) System.out.println(a.length());
        else if(a.length() < b.length()) System.out.println(b.length());
        else {
            if(a.equals(b)) System.out.println("-1");
            else System.out.println(a.length());
        }



    }
}
