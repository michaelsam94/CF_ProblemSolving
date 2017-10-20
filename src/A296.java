import java.util.Map;
import java.util.Scanner;

public class A296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, num;
        int[] nums;
        boolean sol = true;

        n = in.nextInt();


        nums = new int[n];

        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            nums[i] = num;

        }


        for (int i = 0; i < n; i++) {

            int c = 0;
            for (int j=0; j < n;j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(2 * c - 1 > n) sol =false;
        }



        if (sol) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
