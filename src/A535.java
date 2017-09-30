import java.util.Scanner;

public class A535 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num;
		String res = null;
		num = input.next();
		if (num.length() == 1) {
			switch (num) {
			case "0":
				res="zero";
				break;
			case "1":
				res="one";
				break;
			case "2":
				res="two";
				break;
			case "3":
				res="three";
				break;
			case "4":
				res="four";
				break;
			case "5":
				res="five";
				break;
			case "6":
				res="six";
				break;
			case "7":
				res="seven";
				break;
			case "8":
				res="eight";
				break;
			case "9":
				res="nine";
				break;

			default:
				break;
			}
		}
		if (num.length() == 2) {
			switch (num.charAt(1)) {
			case '0':
				res="";
				break;
			case '1':
				res="-one";
				break;
			case '2':
				res="-two";
				break;
			case '3':
				res="-three";
				break;
			case '4':
				res="-four";
				break;
			case '5':
				res="-five";
				break;
			case '6':
				res="-six";
				break;
			case '7':
				res="-seven";
				break;
			case '8':
				res="-eight";
				break;
			case '9':
				res="-nine";
				break;

			default:
				break;
			}
			if(num.charAt(0)!='1'){
				switch (num.charAt(0)) {
				case '2':
					res="twenty"+res;
					break;
				case '3':
					res="thirty"+res;
					break;
				case '4':
					res="forty"+res;
					break;
				case '5':
					res="fifty"+res;
					break;
				case '6':
					res="sixty"+res;
					break;
				case '7':
					res="seventy"+res;
					break;
				case '8':
					res="eighty"+res;
					break;
				case '9':
					res="ninety"+res;
					break;

				default:
					break;
				}
			}
			if(num.charAt(0)=='1'){
				switch (num.charAt(1)) {
				case '0':
					res = "ten";
					break;
				case '1':
					res = "eleven";
					break;
				case '2':
					res="twelve";
					break;
				case '3':
					res="thirteen";
					break;
				case '4':
					res="fourteen";
					break;
				case '5':
					res="fifteen";
					break;
				case '6':
					res="sixteen";
					break;
				case '7':
					res="seventeen";
					break;
				case '8':
					res="eighteen";
					break;
				case '9':
					res="nineteen";
					break;

				default:
					break;
				}
			}
			}
				
			System.out.println(res);

	}

}
