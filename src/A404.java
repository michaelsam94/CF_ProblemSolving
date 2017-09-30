import java.util.ArrayList;
import java.util.Scanner;

public class A404  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //for optimisation in memory usage we can use array of chars
        ArrayList<String> input = new ArrayList<>();
        int size;
        int numOfDiagonalLetter = 0;
        boolean diagonal = true;
        char letterDiagonal, otherLetter;

        size = in.nextInt();
        in.nextLine();

        for (int i = 0; i < size; i++) {
            String line = in.nextLine();
            input.add(line);
        }

        //default values
        letterDiagonal = input.get(0).charAt(0);
        otherLetter = input.get(0).charAt(1);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1 && input.get(i).charAt(j) != letterDiagonal) {
                    diagonal = false;
                    break;
                } else if (i == j && input.get(i).charAt(j) != letterDiagonal) {
                    diagonal = false;
                    break;
                } else if (input.get(i).charAt(j) != letterDiagonal
                        && input.get(i).charAt(j) != otherLetter) {
                    diagonal = false;
                    break;
                } else if (letterDiagonal == otherLetter){
                    diagonal = false;
                    break;
                } else if(j > i && input.get(i).charAt(j) == letterDiagonal && i + j!= size-1){
                    diagonal = false;
                    break;
                }
                if(input.get(i).charAt(j) == letterDiagonal) numOfDiagonalLetter++;
            }
        }

        if(numOfDiagonalLetter > (size * 2) - 1){
            diagonal = false;
        }

        if(diagonal) System.out.println("YES");
        else System.out.println("NO");
    }

}
