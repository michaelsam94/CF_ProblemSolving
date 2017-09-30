import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A1 {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(
                new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter outer = new PrintWriter(new BufferedOutputStream(System.out));
        int squareLength,squareWidth,flagstone;
        long res1,res2;
        squareWidth = scanner.nextInt();
        squareLength = scanner.nextInt();
        flagstone = scanner.nextInt();

        res1 = squareLength /flagstone;
        if(squareLength % flagstone > 0) res1++;
        res2 = squareWidth /flagstone;
        if(squareWidth % flagstone > 0) res2++;

        outer.print(res1 * res2);

        scanner.close();
        outer.close();
    }
}