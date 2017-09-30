import java.util.Scanner;
import java.util.regex.Pattern;

public class A262 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfTestCases,numOfPermittedLuckyNumbers;
        int result = 0;
        numOfTestCases = in.nextInt();
        numOfPermittedLuckyNumbers = in.nextInt();
        for(int i=0 ; i < numOfTestCases; i++){
            String num = in.next();
            int numOfLuckyNumbers = 0;
            for(int j=0; j < num.length(); j++){
                if (Pattern.matches("(4|7)", num.charAt(j)+"")) numOfLuckyNumbers++;
            }
            if(numOfLuckyNumbers <= numOfPermittedLuckyNumbers) result++;
        }
        System.out.println(result);

    }
}
