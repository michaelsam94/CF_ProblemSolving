import java.util.Scanner;

public class A499 {

    public static void main(String[] args) {
        int numOfMomements,skipPeriod,n1,n2,diff;
        int intial = 1;
        int result = 0;
        Scanner in = new Scanner(System.in);
        numOfMomements = in.nextInt();
        skipPeriod = in.nextInt();


        for (int i=0; i<numOfMomements ;i++){
            n1 = in.nextInt();
            n2 = in.nextInt();
            diff = n1 - intial;
            result += diff % skipPeriod;
            diff = (n2 - n1) + 1;
            result += diff;
            intial = n2 + 1;
        }
        System.out.println(result);
    }
}
