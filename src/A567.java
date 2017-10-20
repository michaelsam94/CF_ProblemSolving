import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A567 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] cititesLocation = new int[n];
        List<City> cities = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            cititesLocation[i] = input.nextInt();
        }

        Arrays.sort(cititesLocation);

        int max;
        int min;
        City city;
        int prev;
        int next;
        for (int i = 0; i < cititesLocation.length; i++) {
            if (i == 0) {
                min = Math.abs(cititesLocation[i] - cititesLocation[i + 1]);
                max = Math.abs(cititesLocation[i] - cititesLocation[cititesLocation.length - 1]);

                city = new City(max, min);
                cities.add(city);
            } else if (i == cititesLocation.length - 1) {
                min = Math.abs(cititesLocation[i] - cititesLocation[i - 1]);
                max = Math.abs(cititesLocation[i] - cititesLocation[0]);

                city = new City(max, min);
                cities.add(city);
            } else {

                prev = Math.abs(cititesLocation[i] - cititesLocation[i - 1]);
                next = Math.abs(cititesLocation[i] - cititesLocation[i + 1]);

                min = Math.min(prev, next);

                prev = Math.abs(cititesLocation[i] - cititesLocation[0]);
                next = Math.abs(cititesLocation[i] - cititesLocation[cititesLocation.length - 1]);

                max = Math.max(prev, next);

                city = new City(max, min);
                cities.add(city);
            }
        }

        for(int i=0; i < cities.size(); i++){
            System.out.println(cities.get(i).getMin() + " " + cities.get(i).getMax());
        }


    }


}

class City {
    int max;
    int min;

    public City(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
