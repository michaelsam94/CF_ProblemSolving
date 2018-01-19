import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B47 {

    public static final char BIGGER = '>';
    public static final char SMALLER = '<';

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character,Integer> charWithWeight = new HashMap<>();
        char[] out = new char[3];

        charWithWeight.put('A',0);
        charWithWeight.put('B',0);
        charWithWeight.put('C',0);

        for(int i=0; i < 3;i++){
            String in = scanner.nextLine();
            int old;
            if(in.charAt(1) == SMALLER){
                old = charWithWeight.get(in.charAt(2));
                old++;
                charWithWeight.put(in.charAt(2),old);
            } else if(in.charAt(1) == BIGGER){
                old = charWithWeight.get(in.charAt(0));
                old++;
                charWithWeight.put(in.charAt(0),old);
            }
        }

        for(Map.Entry<Character,Integer> entry : charWithWeight.entrySet()) {
            int value = entry.getValue();
            char key = entry.getKey();
            out[value] = key;
        }

        int weightA = charWithWeight.get('A');
        int weightB = charWithWeight.get('B');
        int weightC  = charWithWeight.get('C');

        if(weightA == weightB || weightB == weightC){
            System.out.print("Impossible");
        } else {
            for (char c : out){
                System.out.print(c);
            }
        }




    }



}
