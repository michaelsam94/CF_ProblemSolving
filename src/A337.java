import java.util.Arrays;
import java.util.Scanner;

public class A337 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		int[] arr;
		int min;
		n = input.nextInt();
		m = input.nextInt();
		arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		min = Integer.MAX_VALUE;
		for (int i = 0; i < m - (n - 1); i++) {
			int diff = arr[i + (n - 1)] - arr[i];
			if (diff < min)
				min = diff;
		}
		
		System.out.println(min);
	}
}
