import java.util.ArrayList;
import java.util.Scanner;

public class A496 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n,min,minI,diff,res;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		n = reader.nextInt();
		min = 4325236;
		minI =0;
		diff = 0;
		res =0;
		for(int i=0;i<n;i++){
			int num = reader.nextInt();
			nums.add(num);
		}
		for(int i=1;i<nums.size()-1;i++){
			diff = nums.get(i+1)-nums.get(i-1);
			if(diff < min) {
				min = diff;
				minI=i;
			}
			
		}
		res = nums.get(minI+1)-nums.get(minI-1);
		for(int i=1;i<nums.size();i++){
			if(i!=minI){
				diff = nums.get(i) - nums.get(i-1);
				if(diff > res) res = diff;
			}
		}
		System.out.println(res);

	}

}
