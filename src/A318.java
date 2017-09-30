import java.util.Scanner;

public class A318 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x, y;
		long odds, evens, res;
		x = input.nextLong();
		y = input.nextLong();
		if (x % 2 == 0) {
			odds = x / 2;
			evens = x / 2;
		} else {
			odds = (x / 2) + 1;
			evens = x / 2;
		}
		if (y <= odds) {
			res = y + (y - 1);
		} else {
			y-=odds;
			res = (y * 2);
		}
		System.out.println(res);
	}
}
