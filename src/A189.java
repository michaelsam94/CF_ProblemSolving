import java.util.*;
import java.io.*;

import static java.lang.Math.max;


public class A189
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
        FastScanner scan = new FastScanner(br);

        int n = scan.nextInt(), a=scan.nextInt(), b=scan.nextInt(), c=scan.nextInt();
        int result=0, cCount=0, diff;
        for (int aCount=0; aCount<=n; aCount++){
            for (int bCount=0; bCount<=n; bCount++){
                diff = n - ((aCount * a) + (bCount * b));
                if (diff >= 0) {
                    if (diff % c == 0) {
                        cCount = diff / c;
                        result = max(result, aCount + bCount + cCount);
                    }
                }
            }
        }
        System.out.println(result);

        pw.close();
        scan.close();
    }
}

