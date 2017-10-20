import java.util.Scanner;

public class A768 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int[] nums;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sol = 0;

        n = in.nextInt();
        nums = new int[n];

        for (int i=0; i < n;i++){
            nums[i] = in.nextInt();

            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];

        }



        for (int i=0;i < n;i++){
            if(nums[i] != max && nums[i] != min) sol++;
        }




        if(n > 2){
            System.out.println(sol);
        } else {
            System.out.println(0);
        }

    }
}
