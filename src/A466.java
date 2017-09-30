import java.util.Arrays;
import java.util.Scanner;

public class A466 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];
		int n, m, a, b;
		n = input.nextInt();
		m = input.nextInt();
		a = input.nextInt();
		b = input.nextInt();
		if (n % m == 0)
			arr[0] = (n / m) * b;
		else if (n % m != 0)
			arr[0] = ((n / m) + 1) * b;

		arr[1] = n * a;
		arr[2] = (n % m) * a + (n / m) * b;
		Arrays.sort(arr);
		System.out.println(arr[0]);

	}
}
