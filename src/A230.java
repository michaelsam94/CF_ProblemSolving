import java.util.Scanner;

public class A230 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s = input.nextInt(), n = input.nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i][0] < s) {
				s += arr[i][1];
				arr[i] = arr[n - 1];
				i = -1;
				n--;
			}
		}
		if (n == 0)
			System.out.println("YES");
		else
			System.out.println("NO");

	}
}
