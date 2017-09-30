import java.util.Scanner;

public class A501 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mishaPoints,vasiaPoints,mishaTime,vasiaTime,mishaScore,vasiaScore;

        mishaPoints = in.nextInt();
        vasiaPoints = in.nextInt();
        mishaTime = in.nextInt();
        vasiaTime = in.nextInt();

        mishaScore = Math.max((3 * mishaPoints)/10,mishaPoints - (mishaPoints / 250) * mishaTime);
        vasiaScore = Math.max((3 * vasiaPoints)/10,vasiaPoints - (vasiaPoints / 250) * vasiaTime);

        if(mishaScore > vasiaScore) System.out.println("Misha");
        else if(mishaScore < vasiaScore) System.out.println("Vasya");
        else System.out.println("Tie");

    }
}
