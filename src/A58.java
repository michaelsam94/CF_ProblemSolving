import java.util.Scanner;

public class A58 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s, s1;
		s = input.next();
		s1 = "hello";
		char last = s.charAt(0);
		int cont = 0;
		int num;
		
		for (int i = 0; i < s.length(); i++) {
			if(cont>=5) break;
			if(s1.charAt(cont)==s.charAt(i)){
				cont++;	
			}
		}
		if(cont==5)System.out.println("YES");
		else System.out.println("NO");
		
	}
}
