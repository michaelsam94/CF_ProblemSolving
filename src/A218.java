import java.util.Scanner;

public class A218 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, k;
        int[] peaks;

        n = input.nextInt();
        k = input.nextInt();


        peaks = new int[2 * n + 1];


        for (int i = 0; i < (2 * n) + 1; i++) {
            peaks[i] = input.nextInt();
        }


        int it = k;
        for (int i = 1; i < 2 * n; i++) {
            if (peaks[i] - peaks[i - 1] > 1 && peaks[i] - peaks[i + 1] > 1) {
                peaks[i]--;
                it--;
                if (it == 0) {
                    break;
                }
            }
        }


        for (int i = 0; i < (2 * n) + 1; i++) {
            System.out.print(peaks[i] + " ");
        }

    }
}
