import java.util.Scanner;

public class A236 {
	public static void main(String[] args) {
		String x;
		Scanner input = new Scanner(System.in);

		x = input.next();
		int len;

		len = 0;
		for (int i = 0; i < x.length(); i++) {
			if(x.charAt(i)!='!') {
				len++;
			}
			char c = x.charAt(i);
			
			x=x.replace(c, '!');
		}
		if (len % 2 == 0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");

	}

}
