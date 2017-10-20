import java.util.Scanner;

public class A682 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,m;
        long[] nArr,mArr;


        n = in.nextInt();
        m = in.nextInt();

        nArr = new long[5];
        mArr = new long[5];

        for (int i=1; i <= n; i++){
            nArr[i % 5]++;
        }

        for (int i=1; i <= m; i++){
            mArr[i % 5]++;
        }

        System.out.println(nArr[1] * mArr[4] + nArr[4] * mArr[1]
                + nArr[3] * mArr[2]  + nArr[2] * mArr[3] + nArr[0] * mArr[0]);


    }
}
