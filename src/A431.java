import java.util.Scanner;

public class A431 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sol = 0;
        int[] calories = new int[4];

        for (int i=0 ; i < 4; i++){
            calories[i] = in.nextInt();
        }

        String s = in.next();

        for (char c : s.toCharArray()){
            switch (c){
                case '1':
                    sol += calories[0];
                break;
                case '2':
                    sol += calories[1];
                    break;
                case '3':
                    sol += calories[2];
                    break;
                case '4':
                    sol += calories[3];
                    break;
            }
        }

        System.out.println(sol);

    }
}
