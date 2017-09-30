import java.util.Scanner;

public class A381 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sereja = 0, dima = 0;
        int[] nums = new int[n];
        int lastInd = -1;

        for (int i=0; i < n; i++){
            nums[i] = in.nextInt();
        }


        for (int i = 0, j = n - 1,k=0; i - j !=0;k++) {
            if(k % 2 == 0){
                if(nums[i] > nums[j]){
                    sereja += nums[i];
                    i++;
                } else {
                    sereja += nums[j];
                    j--;
                }

            } else {
                if(nums[i] > nums[j]){
                    dima += nums[i];
                    i++;
                } else {
                    dima += nums[j];
                    j--;
                }
            }
            if(i == j) lastInd = i;
        }

        if(lastInd != -1){
            if(n % 2 != 0) sereja += nums[lastInd];
            else dima += nums[lastInd];
        } else {
            sereja+=nums[0];
        }


        System.out.println(sereja + " " + dima);

    }
}
