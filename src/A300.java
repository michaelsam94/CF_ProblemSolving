import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A300 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, num;
        List<Integer> zeros, minus, plus;

        zeros = new ArrayList<>();
        minus = new ArrayList<>();
        plus = new ArrayList<>();


        x = in.nextInt();

        for (int i = 0; i < x; i++) {
            num = in.nextInt();

            if (num < 0) {
                minus.add(num);
            } else if (num > 0) {
                plus.add(num);
            } else {
                zeros.add(num);
            }
        }


        if (minus.size() % 2 == 0 && minus.size() != 0) {
            zeros.add(minus.get(0));
            minus.remove(0);
        }

        if(plus.size() == 0 && minus.size() > 2){
            plus.add(minus.get(0));
            plus.add(minus.get(1));

            minus.remove(0);
            minus.remove(0);
        }

        System.out.print(minus.size() + " ");
        for (Integer i : minus) {
            System.out.print(i + " ");
        }

        System.out.println();


        System.out.print(plus.size() + " ");
        for (Integer i : plus) {
            System.out.print(i + " ");
        }

        System.out.println();


        System.out.print(zeros.size() + " ");
        for (Integer i : zeros) {
            System.out.print(i + " ");
        }

        System.out.println();


    }
}
