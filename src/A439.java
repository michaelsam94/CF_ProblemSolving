import java.util.Scanner;

public class A439 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,d;
		int sum=0;
		int intervals,remain;
		n = input.nextInt();
		d = input.nextInt();
		for(int i=0;i<n;i++){
			sum+=input.nextInt();	
		}
		intervals = (n-1)*10;
		remain = d-(intervals+sum);
		if(remain<0) System.out.println("-1");
		else{
			remain+=intervals;
			remain/=5;
			System.out.println(remain);
		}
	}
}
