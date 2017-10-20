import java.util.*;

// TODO: 14-Oct-17 solve A767 
public class A767 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int[] allSnacks;
        boolean[] isComeBefore;


        x = input.nextInt();
        allSnacks = new int[x];
        isComeBefore = new boolean[x + 1];


        for (int i = 0; i < x; i++) {
            allSnacks[i] = input.nextInt();

            StringBuilder sb = new StringBuilder();
           
            sb.append(allSnacks[i]);
            for (int j = i; j >= 0; j--) {
                if (allSnacks[j] < allSnacks[i]) {
                    sb.append(" " + allSnacks[j]);

                }
            }

            System.out.println(sb.toString());


        }


    }
}
