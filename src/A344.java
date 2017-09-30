import java.util.Scanner;

public class A344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        boolean isPrevPlus;
        boolean isCurrentPlus;
        int numOfGroups = 1;
        String currentMagnet;
        String prevMagnet = in.next();



        for (int i=1; i < n; i++){
            currentMagnet = in.next();
            isPrevPlus = isPlus(prevMagnet);
            isCurrentPlus = isPlus(currentMagnet);

            if(isCurrentPlus != isPrevPlus) numOfGroups++;


            prevMagnet = currentMagnet;
        }

        System.out.println(numOfGroups);


    }

    private static boolean isPlus(String magnet){
        boolean isPlus = false;
        if(magnet.toCharArray()[1] == '1'){
            isPlus = false;
        } else if(magnet.toCharArray()[1] == '0') {
            isPlus = true;
        }
        return isPlus;
    }
}
