import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A133 {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(
                new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter outer = new PrintWriter(new BufferedOutputStream(System.out));
        String programStatment = scanner.nextString();

        outer.print(programStatment.matches(".*[HQ9].*") ? "YES" : "NO");


        scanner.close();
        outer.close();
    }
}






