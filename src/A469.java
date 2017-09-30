import java.util.Arrays;
import java.util.Scanner;

public class A469 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,n1,n2;
		int[]arr1;
		int[]arr2;
		int[]arr3;
		n = input.nextInt();
		n1=input.nextInt();
		arr1=new int[n1];
		for(int i=0;i<n1;i++){
			arr1[i]=input.nextInt();
			
		}
		n2 = input.nextInt();
		arr2 = new int[n2];
		for(int i=0;i<n2;i++){
			arr2[i]=input.nextInt();
		}
		arr3 = new int[n1+n2];
		for(int i=0;i<n1+n2;i++){
			if(i<n1) arr3[i]=arr1[i];
			else{
				int num = i-n1;
				arr3[i]=arr2[num];
			}
		}

		Arrays.sort(arr3);
		boolean b=true;;
		for(int i=0;i<(n1+n2)-1;i++){
			if(arr3[i+1]-arr3[i]>1){
				b=false;
				break;
			}
		}
		if(b==true){
			if(n1+n2>0&&arr3[(n1+n2)-1]==n&&arr3[0]==1) System.out.println("I become the guy.");
			else System.out.println("Oh, my keyboard!");
		}
		else System.out.println("Oh, my keyboard!");
		
	}
}
