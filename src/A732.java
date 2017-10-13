import java.util.Scanner;

public class A732 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price,numOfChange;
        int sol = -1;

        price = in.nextInt();
        numOfChange = in.nextInt();

        for (int i=1;i<1000;i++){
            if((((price * i) % 10) - numOfChange) == 0 || ((price * i) % 10) == 0){
                sol = i;
                break;
            }
        }

        System.out.println(sol);
    }
}
