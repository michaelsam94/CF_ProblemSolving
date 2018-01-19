import java.util.Scanner;

public class B102 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        String in = scanner.nextLine();
        String sum = in;


        if (in.length() == 1) {
            System.out.print("0");
        } else {
            int count=0;
            while (sum.length() > 1) {
                int x=0;
                for (char c : sum.toCharArray()){
                    x += Integer.parseInt(c+"");
                }
                sum = String.valueOf(x);
                count++;
            }
            System.out.print(count);
        }


    }

}
