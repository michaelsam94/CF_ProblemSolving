import java.util.Arrays;
import java.util.Scanner;

public class A479 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		int[] arr = new int[5];
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		arr[0]=a+b*c;
		arr[1]=a*(b+c);
		arr[2]=a*b*c;
		arr[3]=(a+b)*c;
		arr[4]=a+b+c;
		Arrays.sort(arr);
		System.out.println(arr[4]);
		
	}
}
