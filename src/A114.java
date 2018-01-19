import java.util.Scanner;

public class A114 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long x,y,res;
        int la=0;
        boolean isLa = false;

        x = input.nextInt();
        y = input.nextInt();

        res = x;

        if(y==1) System.out.println("YES\n" + 0);
        else {
            while (res < y){
                res *= x;
                la++;
            }

            if(res==y){
                System.out.println("YES\n" + la );
            } else {
                System.out.println("NO");
            }

        }

    }
}
