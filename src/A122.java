import java.util.Scanner;

public class A122 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		x = input.nextInt();
		int[]arr={4,7,44,47,74,77,444,447,474,477,744,747,774,777};
		for(int i=0;i<arr.length;i++){
			if(x%arr[i]==0) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}
}
