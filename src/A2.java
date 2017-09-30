import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A2 {

    //todo a2 codeforces problem
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, score;
        int highScore = 0;
        String winnerName = null;
        String name;
        Map<String, Integer> rounds = new HashMap<>();

        n = in.nextInt();

        for (int i = 0; i < n; i++) {
            name = in.next();
            score = in.nextInt();

            if (rounds.isEmpty()) {
                rounds.put(name, score);
                winnerName = name;
                highScore = score;
            } else {
                Integer value = rounds.get(name);
                if (value != null) {
                    value += score;
                    rounds.put(name, value);
                    if (value > highScore) {
                        highScore = value;
                        winnerName = name;
                    }
                } else {
                    rounds.put(name, score);
                    if (score > highScore) {
                        highScore = score;
                        winnerName = name;
                    }
                }
            }


        }

        System.out.println(winnerName);

    }

}
