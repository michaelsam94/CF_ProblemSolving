import java.util.Scanner;

public class A448 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] cups=new int[3];
		int[] medals= new int[3];
		int sumC,sumM,nC,nM,n;
		sumC =0;
		sumM =0;
		for(int i=0;i<3;i++){
				cups[i] = input.nextInt();
				sumC+=cups[i];
			
		}
		for(int i=0;i<3;i++){
			medals[i]=input.nextInt();
			sumM+=medals[i];
		}
		n = input.nextInt();
		nC = sumC/5;
		if(sumC%5>0) nC++;
		nM = sumM/10;
		if(sumM%10>0) nM++;
		if((nC+nM)>n) System.out.println("NO");
		else System.out.println("YES");
		
		
		
		

	}
}
