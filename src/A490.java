import java.util.Scanner;

public class A490 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int[] arr;
		int[]arr1;
		int[]arr2;
		int[]arr3;
		int a1 = 0, a2 = 0, a3 = 0;
		int min;
		n = input.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			if (arr[i] == 1)
				a1++;
			else if (arr[i] == 2)
				a2++;
			else if (arr[i] == 3)
				a3++;
		}
		arr1 = new int[a1];
		arr2 = new int[a2];
		arr3 = new int[a3];
		min = a1;
		if (min > a2)
			min = a2;
		if (min > a3)
			min = a3;
		System.out.println(min);
		
		a1=0;
		a2=0;
		a3=0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1){
				arr1[a1]=i+1;
				a1++;
			}
				
			else if (arr[i] == 2){
				arr2[a2]=i+1;
				a2++;
			}
				
			else if (arr[i] == 3){
				arr3[a3]=i+1;
				a3++;
			}
				
		}
		for(int i=0;i<min;i++){
			System.out.println(arr1[i]+" "+arr2[i]+" "+arr3[i]);
		}

	}

}
