import java.util.Scanner;

public class A510 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		char arr[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(i%2==0||(i+1)%4==0&&j==0||(i+3)%4==0&&j==m-1){
					arr[i][j]='#';
				}
				else {
					arr[i][j]='.';
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}
}
