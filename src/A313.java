import java.util.Scanner;

public class A313 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x, y;
		String s;
		int a, b;
		x = input.nextLong();
		y = x;
		if (x < 0)
			y *= -1;
		a = (int) y % 10;
		b = (int) y % 100;
		b = (int) b / 10;
		if (x > 0) {
			System.out.println(x);
		} else {
			if (a > b) {
				x/=10;
			} else {
				x/=100;
				x*=10;
				x*=-1;
				x+=a;
				x*=-1;
			}
			System.out.println(x);
		}

	}
}
