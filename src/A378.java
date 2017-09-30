import java.util.Scanner;

public class A378 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x,y,resX,resY,resD;
		x = reader.nextInt();
		y = reader.nextInt();
		resX=0;
		resY=0;
		resD=0;
		for(int i=1;i<=6;i++){
			int difX = x-i;
			int difY = y-i;
			if(difX<0) difX*=-1;
			if(difY<0) difY*=-1;
			if(difX>difY) resY++;
			else if(difX<difY) resX++;
			else resD++;
		}
		System.out.print(resX + " " + resD + " " + resY);

	}

}
