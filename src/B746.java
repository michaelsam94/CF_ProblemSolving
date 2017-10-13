import java.util.Scanner;

public class B746 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        String x;
        int indexOfInsertedChar;
        StringBuilder sbIn;
        StringBuilder sbOut = new StringBuilder();

        n = input.nextInt();
        x = input.next();

        sbIn = new StringBuilder(x);

        for (int i=1; i <= n; i++){
            if(i < 3){
                indexOfInsertedChar = 0;
            } else {
                indexOfInsertedChar = i % 2 != 0? (i /2) : (i /2) - 1;
            }


            sbOut.insert(indexOfInsertedChar,sbIn.charAt(sbIn.length() - 1));
            sbIn.deleteCharAt(sbIn.length() - 1);


        }

        System.out.println(sbOut.toString());




    }
}
