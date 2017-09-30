import java.util.Scanner;

public class A385 {
	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		max*=-1;
		Scanner input = new Scanner(System.in);
		int n,c;
		int[] x;
		n = input.nextInt();
		c = input.nextInt();
		x=new int[n];
		for(int i=0;i<n;i++){
			x[i]=input.nextInt();
		}
		
			for(int i=0;i<n-1;i++){
				int num=x[i]-x[i+1]-c;
				if(num>0&&num>max){	
					max=num;
				}
				
			}
			
			if(max>0) System.out.println(max);
			else System.out.println(0);

	}
}
