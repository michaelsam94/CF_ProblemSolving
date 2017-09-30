import java.util.Scanner;

public class A339 {
	public static void main(String[] args) {
		String s;
		char[] n;
		Scanner input = new Scanner(System.in);
		s = input.nextLine();
		n = s.toCharArray();
		for(int i=0;i<n.length;i++){
			for(int j=0;j<s.length();j++){
				if(n[i]<n[j]&&n[i]!='+'){
					char t;
					t = n[i];
					n[i]=n[j];
					n[j]=t;
				}
			}
		}
		s = new String(n);
		System.out.println(s);
	}
}
