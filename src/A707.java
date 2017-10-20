import java.util.Scanner;

public class A707 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        char c;
        boolean sol = true;

        x = input.nextInt();
        y = input.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c = input.next().charAt(0);
                if(c == 'C' || c== 'M' || c== 'Y') sol =false;
            }
        }

        if(sol){
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }




    }
}
