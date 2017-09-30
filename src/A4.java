import java.util.Scanner;

public class A4  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        if(x%2==0&&x!=2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
