import java.util.Scanner;

public class A556 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,numOfZeros = 0, numOfOnes = 0;
        String x;

        n = input.nextInt();
        x = input.next();

        for (Character c : x.toCharArray()){
            if(c == '0'){
                numOfZeros++;
            } else if(c == '1'){
                numOfOnes++;
            }
        }

        System.out.println(Math.abs(numOfOnes - numOfZeros));




    }
}
