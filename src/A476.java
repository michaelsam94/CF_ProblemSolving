import java.util.Scanner;

public class A476 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, m;
		int[] arr= new int[3];
		n = input.nextInt();
		m = input.nextInt();
		int max,min;
		min = (n+1)/2;
		max = n;
		boolean b=true;
		for(int i=min;i<=max;i++){
			if(i%m==0){
				System.out.println(i);
				b=false;
				break;
			}
		}
		if(b){
			System.out.println("-1");
		}
		
	}
}
