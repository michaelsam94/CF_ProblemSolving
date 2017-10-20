import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A80 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;

        List<Integer> primes = new ArrayList<>();


        n = in.nextInt();
        m = in.nextInt();

        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = i - 1; j > 1; j--) {
                if(i % j == 0) isPrime = false;
            }
            if(isPrime) primes.add(i);
        }



        int index=0;
        boolean sol = false;
        for (Integer i : primes){
            if(i == n) {
                if(index < primes.size()-1){
                    if(m == primes.get(index+1)) sol = true;
                }
            }
            index++;
        }

        if(sol){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
