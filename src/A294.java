import java.util.Scanner;

public class A294 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfBoxes = in.nextInt();
        int[] birdsPerBox = new int[numOfBoxes];
        int numOfFires;
        int fireBoxe;
        int[] rights;
        int[] lefts;
        int killedBird;
        int[] sol = new int[numOfBoxes];


        for (int i=0;i< numOfBoxes; i++){
            birdsPerBox[i] = in.nextInt();
        }

        numOfFires = in.nextInt();

        rights = new int[numOfBoxes];
        lefts = new  int[numOfBoxes];

        for (int i=0; i < numOfFires; i++){
            fireBoxe = in.nextInt();
            killedBird = in.nextInt();

            fireBoxe--;



            if(fireBoxe != numOfBoxes - 1) birdsPerBox[fireBoxe + 1] += birdsPerBox[fireBoxe]  - killedBird;
            if(fireBoxe != 0) birdsPerBox[fireBoxe - 1] += killedBird - 1;

           birdsPerBox[fireBoxe] = 0;


        }

        for (int i=0; i < numOfBoxes; i++){
            System.out.println(birdsPerBox[i]);
        }













    }
}
