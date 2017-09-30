import java.util.Scanner;

public class A459 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3, y3, x4, y4;
		int numX, numY;
		numX = Math.abs(x2 - x1);
		numY = Math.abs(y2 - y1);
		if ((numX != numY && numX != 0 && numY != 0)) {
			System.out.println("-1");
		} else {
			if (x1 == x2) {
				x3 = x4 = numY + x1;
				y3 = y1;
				y4 = y2;
				System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
			} else if (y1 == y2) {
				y3 = y4 = numX + y1;
				x3 = x1;
				x4 = x2;
				System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
			} else {
				x3 = x1;
				y3 = y2;
				y4 = y1;
				x4 = x2;
				System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
			}
		}

	}

}
