import java.util.Scanner;

public class GymA101581 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, y;
        int[] remainX;
        int[] remainY;
        String xStr, yStr;
        boolean sol = true;

        x = in.nextInt();
        y = in.nextInt();

        xStr = String.valueOf(x);
        yStr = String.valueOf(y);


        remainX = new int[xStr.length()];
        remainY = new int[yStr.length()];


        for (int i = xStr.length()-1; i >= 0; i--) {
            remainX[i] = Integer.parseInt(xStr.charAt(i) + "") + Integer.parseInt(yStr.charAt(i) + "");
        }




        int i = xStr.length() - 1;
        while (i > 0) {
            if (remainX[i]  > 9){
                if(xStr.charAt(i-1) == '0' || yStr.charAt(i-1) == '0') sol = false;
            }
            i--;
        }


        if(sol){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }


    private static int getTenth(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append("1");

        for (int i = 0; i < num; i++) {
            sb.append("0");
        }

        return Integer.valueOf(sb.toString());
    }
}
