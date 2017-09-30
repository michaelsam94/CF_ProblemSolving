import java.util.Scanner;

public class A233 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        if(size % 2 != 0){
            System.out.println(-1);
        } else {
            for(int i=1; i <= size; i+=2){
                System.out.print(i+1 +" " + i + " ");
            }
        }
    }
}
