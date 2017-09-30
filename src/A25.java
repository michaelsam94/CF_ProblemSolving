import java.util.Scanner;

public class A25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int[] arr;
		int[] arr1;
		int evenN=0;
		int oddN=0;
		n = input.nextInt();
		
		arr = new int[n];
		arr1 =new int[n];
		boolean b=false;
		for(int i=0;i<n;i++){
			arr[i]=input.nextInt();
			arr1[i]=arr[i]%2;
			if(arr[i]%2==0) evenN++;
			else oddN++;
		}
		if(evenN==1){
			for(int i=0;i<n;i++){
				if(arr1[i]==0){
					System.out.println(i+1);
					break;
				}
			}
		}
		else if(oddN==1){
			for(int i=0;i<n;i++){
				if(arr1[i]==1){
					System.out.println(i+1);
					break;
				}
			}
		}

	}

}
