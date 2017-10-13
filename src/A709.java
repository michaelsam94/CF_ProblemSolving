import java.util.Scanner;

public class A709 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfOragnes,maxOrangeSize,recleanLimit;
        int currentOrange;
        int sol = 0;
        int wastCount = 0;

        numOfOragnes = input.nextInt();
        maxOrangeSize = input.nextInt();
        recleanLimit = input.nextInt();



        for (int i=0; i < numOfOragnes; i++){
            currentOrange = input.nextInt();

            if(currentOrange <= maxOrangeSize){
                wastCount += currentOrange;

                if(wastCount > recleanLimit){
                    sol++;
                    wastCount = 0 ;
                }
            }

        }

        System.out.println(sol);



    }
}
