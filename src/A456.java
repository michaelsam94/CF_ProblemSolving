import java.util.Scanner;

public class A456 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
			int price = in.nextInt();
			int quality = in.nextInt();
			if (quality > price) {
				System.out.println("Happy Alex");
				return;
			}
		}
		System.out.println("Poor Alex");
	
		
	}
}
