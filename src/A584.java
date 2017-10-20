import java.util.Scanner;

public class A584 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, t;

        n = input.nextInt();
        t = input.nextInt();
        StringBuilder sb = new StringBuilder();

        if(n == 1 && t == 10 ) System.out.println(-1);
        else {
            if(t == 10){
                for (int i = 0; i < n; i++) {
                    if(i==0) sb.append(1);
                    else sb.append(0);
                }
            } else {
                for (int i=0; i < n; i++){
                    sb.append(t);
                }
            }

            System.out.println(sb.toString());
        }


    }
}
