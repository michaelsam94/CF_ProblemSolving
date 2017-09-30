import java.util.Scanner;

public class A451 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m,n;
		int x;
		n = input.nextInt();
		m = input.nextInt();
		
		if(n!=m){
			if(n<m) x=n;
			else x=m;
		}
		else x = m;
		if(x%2==0) System.out.println("Malvika");
		else System.out.println("Akshat");
	}
}
