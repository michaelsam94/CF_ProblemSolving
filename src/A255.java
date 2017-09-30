import java.util.Scanner;

public class A255 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n,chest,bie,back;
		chest = 0;
		bie = 0;
		back = 0;
		n = reader.nextInt();
		for(int i=0;i<n;i++){
			int num = reader.nextInt();
			if(i<3){
				if(i==0) chest+=num;
				else if(i==1) bie+=num;
				else back+=num;
			} else{
				if(i%3==0) chest+=num;
				else if((i-1)%3==0) bie+=num;
				else if((i-2)%3==0) back+=num;
			}
			
			
			
		}
		if (chest > bie && chest > back){
			System.out.println("chest");
		} else if (bie > chest && bie > back){
			System.out.println("biceps");
		} else {
			System.out.println("back");
		}

	}

}
