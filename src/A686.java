import java.util.Scanner;

public class A686 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInQueue,current,depressed = 0;
        long numOfPacks;
        char sign;

        numInQueue = input.nextInt();

        numOfPacks = input.nextInt();


        for (int i=0; i < numInQueue; i++){
            sign = input.next().charAt(0);
            current = input.nextInt();
            if(sign == '+'){
                numOfPacks += current;
            } else if(sign == '-'){
                if(numOfPacks - current >= 0){
                    numOfPacks -= current;
                } else {
                    depressed++;
                }
            }
        }

        System.out.println( numOfPacks+ " " + depressed);

    }
}
