import java.util.Scanner;

public class A467 {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		int[] p;
		int[] c;
		int res=0;
		int cont=0;
		n = input.nextInt();
		p = new int[n];
		c = new int[n];
		for(int i=0;i<n;i++){
			p[i] = input.nextInt();
			c[i] = input.nextInt();
			res = c[i] - p[i];
			if(res>=2) cont++;
		}
		System.out.println(cont);

	}
}
