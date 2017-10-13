import java.util.Scanner;

public class A807 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isRated = false,isUnRated = false,isMaybe = false;

        int x = input.nextInt();
        int currentBefore,currentAfter;
        int prevBefore = -1;

        for (int i=0; i < x; i++){
            currentBefore = input.nextInt();
            currentAfter = input.nextInt();



            if(currentBefore != currentAfter){
                isRated = true;
                isMaybe = false;
                isUnRated =false;
                break;
            }

            if(prevBefore !=-1 && prevBefore < currentBefore) {
                isUnRated = true;
            }

            prevBefore = currentBefore;

        }

        if(!isRated && !isUnRated) {
            isMaybe = true;
        }

        if(isRated){
            System.out.println("rated");
        } else if (isMaybe){
            System.out.println("maybe");
        } else if (isUnRated){
            System.out.println("unrated");
        }


    }
}
