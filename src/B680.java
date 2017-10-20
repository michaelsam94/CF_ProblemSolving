import java.util.Collections;
import java.util.Scanner;

public class B680 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfCities, currentCity;
        char[] crimeInCities;
        int steps;
        char right, left;

        int sol = 0;

        numOfCities = input.nextInt();
        currentCity = input.nextInt();

        //o base index
        currentCity--;

        crimeInCities = new char[numOfCities];


        for (int i = 0; i < numOfCities; i++) {
            crimeInCities[i] = input.next().charAt(0);
        }

        steps = Math.max(numOfCities - currentCity, currentCity - 0);


        for (int i = 0; i <= steps; i++) {
            right = '-';
            left = '-';
            if (currentCity - i >= 0) left = crimeInCities[currentCity - i];
            if (currentCity + i < numOfCities) right = crimeInCities[currentCity + i];

            if (right == left && right == '1') {
                if (i != 0) {
                    sol += 2;
                } else if (i == 0) {
                    sol++;
                }
            } else if (right != left) {
                if ((right == '1' && left == '-') || (left == '1' && right == '-')) {
                    sol++;
                }
            }

        }

        System.out.println(sol);

    }
}
