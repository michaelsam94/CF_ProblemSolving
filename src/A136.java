import java.util.Scanner;

public class A136 {
	public static void main(String[] args) {
		int x;
		int[]arr;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();

		arr = new int[x];
		for(int i=1;i<=x;i++){
			arr[input.nextInt()-1]=i;
		}
		for(int i=0;i<x;i++){
			System.out.print(arr[i]+" ");
		}

	}
}
