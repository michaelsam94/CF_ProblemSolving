import java.util.Scanner;

public class A276 {
	
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		Scanner input = new Scanner(System.in);
		int n, k;
		int f;
		int t;
		n = input.nextInt();
		k = input.nextInt();

		for (int i = 0; i < n; i++) {
			f = input.nextInt();
			t = input.nextInt();

			if (t > k) {
				int num = f - (t - k);
				if (num > max)
					max = num;
			} else {
				if (f > max)
					max = f;
			}

		}
		System.out.println(max);

	}

}
