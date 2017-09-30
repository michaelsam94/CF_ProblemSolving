import java.util.Scanner;

public class A762 {

    public static void main(String[] args) {
        long n,k;
        long currentK=1;
        boolean isKExist = false;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        k = in.nextLong();
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                if(currentK == k) {
                    System.out.println(i);
                    isKExist = true;
                    break;
                }
                currentK++;
            }
        }
        if(!isKExist) System.out.println(-1);
    }
}
