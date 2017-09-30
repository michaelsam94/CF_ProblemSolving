import java.io.BufferedReader;
import java.util.StringTokenizer;

public class FastScanner {
	BufferedReader br;
    StringTokenizer st;

    public FastScanner(BufferedReader bufferedReader) {
        this.br = bufferedReader;
    }

    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
    public String nextString() throws Exception {
        return br.readLine();
    }
    public void close() throws Exception {
        br.close();
    }
}
