import java.util.Scanner;

public class A160 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int sum=0;
		int res=0;
		int[] coins;
		n = input.nextInt();
		coins = new int[n];
		for(int i=0;i<n;i++){
			coins[i]=input.nextInt();
			sum+=coins[i];
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(coins[i]<coins[j]){
					int x;
					x = coins[i];
					coins[i]=coins[j];
					coins[j]=x;
				}
			}
		}
		int counter=0;
		while(true){
			sum-=coins[counter];
			res+=coins[counter];
			counter++;
			if(res>sum) break;
			
		}
		System.out.println(counter);
	}
}
