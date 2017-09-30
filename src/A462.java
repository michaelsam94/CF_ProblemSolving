import java.util.Scanner;

public class A462 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		char[][] arr;
		int n;
		n = input.nextInt();
		arr = new char[n][n];
		for(int i=0;i<n;i++){
			arr[i]=input.next().toCharArray();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int c = 0;
				if (i > 0 && arr[i - 1][j] == 'o')
					c++;
				if (i < arr.length - 1 && arr[i + 1][j] == 'o')
					c++;
				if (j > 0 && arr[i][j - 1] == 'o')
					c++;
				if (j < arr.length - 1 && arr[i][j + 1] == 'o')
					c++;
				if (c % 2 != 0) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
		
	}
}
