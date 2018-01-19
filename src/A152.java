import java.util.*;

public class A152 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, m;
        int[][] grades;
        int[] maxGrades;

        n = input.nextInt();
        m = input.nextInt();

        grades = new int[n][m];
        maxGrades = new int[m];


        for (int i = 0; i < n; i++) {
            String x = input.next();
            int j = 0;
            for (char c : x.toCharArray()) {
                grades[i][j] = Character.getNumericValue(c);
                if (grades[i][j] > maxGrades[j]) maxGrades[j] = grades[i][j];
                j++;
            }
        }


        int sol =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grades[i][j] == maxGrades[j]) {
                    sol++;
                    break;
                }
            }
        }


        System.out.println(sol);




    }


}



