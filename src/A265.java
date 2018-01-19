import java.util.Scanner;

public class A265 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x,y;

        int sol = 0;


        x = input.next();
        y = input.next();


        for (char c : y.toCharArray()){
            if(c == x.charAt(sol)){
                sol++;
            }
        }

        System.out.println(sol + 1);

    }
}
