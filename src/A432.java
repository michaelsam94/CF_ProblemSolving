import java.util.Scanner;

public class A432 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,k;
		int[] arr;
		n = input.nextInt();
		k = input.nextInt();
		arr = new int[n];
		int si=0;
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			arr[i]+=k;
			if(arr[i]<=5)si++;
		}
		System.out.println(si/3);
		

	}
}
