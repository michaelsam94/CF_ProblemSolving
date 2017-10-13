import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        String anInput;
        int currentCount;
        int max = -1;
        String maxTeam = new String();
        Map<String,Integer> allInput = new HashMap<>();

        n = input.nextInt();

        for (int i=0; i < n; i++){
            anInput = input.next();
            if(!allInput.containsKey(anInput)){
                allInput.put(anInput,1);
            } else {
                currentCount = allInput.get(anInput);
                currentCount++;
                allInput.put(anInput,currentCount);
            }
        }


        for (Map.Entry<String ,Integer> entry : allInput.entrySet()){
            if(entry.getValue() > max) {
                max = entry.getValue();
                maxTeam = entry.getKey();
            }
        }


        System.out.println(maxTeam);




    }
}
