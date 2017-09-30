import java.util.Scanner;

public class A59 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfUps = 0,numOfLows = 0;
        String word = in.next();

        for (char c : word.toCharArray()){
            if(c >= 65 && c <= 90){
                numOfUps++;
            } else if(c >= 97 && c <= 122){
                numOfLows++;
            }
        }

        if(numOfUps > numOfLows) System.out.println(word.toUpperCase());
        else System.out.println(word.toLowerCase());

    }

}
