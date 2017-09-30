import java.util.Scanner;

public class A734 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String winner;
        int n;
        int anton = 0,danik = 0;

        n = in.nextInt();

        winner = in.next();

        for (char win : winner.toCharArray()){
            if(win == 'A'){
                anton++;
            } else if(win == 'D'){
                danik++;
            }
        }

        if(anton > danik){
            System.out.println("Anton");
        } else if(danik > anton){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }



    }
}
