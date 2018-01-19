
import java.util.Arrays;
import java.util.Scanner;

public class B492 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n,l;

        n = scanner.nextInt();
        l = scanner.nextInt();

        int nums[] = new int[n];

        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);
        int bigDiff = 0;
        for (int i=0; i < nums.length-1 ;i++){
            if(nums[i+1] - nums[i] > bigDiff) bigDiff = nums[i+1] - nums[i];
        }

        double res = bigDiff / 2.0;



        if(nums[0] > res) res = nums[0];
        if(l - nums[nums.length-1] > res) res = l - nums[nums.length - 1];

        System.out.print(res);

    }

}
