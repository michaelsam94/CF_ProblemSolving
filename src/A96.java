import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A96 {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(
                new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter outer = new PrintWriter(new BufferedOutputStream(System.out));
        String playersSituation = scanner.nextString();
        if(playersSituation.indexOf("0000000")!= -1
                || playersSituation.indexOf("1111111") != -1) outer.print("YES");
        else outer.print("NO");


        scanner.close();
        outer.close();
    }
}

