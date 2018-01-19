import java.util.Arrays;
import java.util.Scanner;

public class A723 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = new int[3];

        for (int i=0;i < 3;i++){
            nums[i] = input.nextInt();
        }


        Arrays.sort(nums);


        System.out.println(nums[1] - nums[0] + nums[2] - nums[1]);

    }
}
