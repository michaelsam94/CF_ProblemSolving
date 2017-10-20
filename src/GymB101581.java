import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GymB101581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        String person;

        int numOfAcions;
        String[] actions;
        Map<String,Integer> peopleAcitons = new HashMap<>();


        person = in.next();
        numOfAcions = in.nextInt();
        actions = new String[numOfAcions];

        for (int i=0; i < numOfAcions; i++){
            String action = in.nextLine();
            int ac = 0;
            String[] words = action.split(" ");
            if(words[1].contains("posted")){
                ac+= 15;
            } else if(words[1].contains("commented")){
                ac+= 10;
            } else if(words[1].contains("likes")){
                ac+= 5;
            }
            peopleAcitons.put(words[0],ac);
        }


        for(Map.Entry<String,Integer> e : peopleAcitons.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
