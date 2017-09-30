import java.util.Scanner;

public class A144 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int[] arr;
		int max,min;
		min = Integer.MAX_VALUE;
		max =0;
		int res=0;
		int mI = 0,MI = 0;
		n = input.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = input.nextInt();
			if(arr[i]>max){
				max = arr[i];
				MI = i;
			}
			if(arr[i]<=min){
				min = arr[i];
				mI =i;
			}
		}
		res = MI;
		res +=n-mI-1;
		if(mI<MI){
			res--;
		}
		System.out.println(res);

}
}
