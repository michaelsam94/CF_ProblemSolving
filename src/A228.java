import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A228 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<Integer> x = new LinkedHashSet<>();


        for (int i = 0; i < 4; i++) {
            x.add(in.nextInt());
        }

        System.out.println(4 - x.size());
    }
}
