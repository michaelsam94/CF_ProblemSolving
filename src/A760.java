import java.util.HashMap;
import java.util.Scanner;

public class A760 {

	public static void main(String[] args) {
		HashMap daysInEachMonth = new HashMap();
		daysInEachMonth.put(1,31);
		daysInEachMonth.put(2,28);
		daysInEachMonth.put(3,31);
		daysInEachMonth.put(4,30);
		daysInEachMonth.put(5,31);
		daysInEachMonth.put(6,30);
		daysInEachMonth.put(7,31);
		daysInEachMonth.put(8,31);
		daysInEachMonth.put(9,30);
		daysInEachMonth.put(10,31);
		daysInEachMonth.put(11,30);
		daysInEachMonth.put(12,31);
		
		
		int d,m,numOfDays,numOfCols;
		int firstCol;
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		d = in.nextInt();
		numOfDays = (int) daysInEachMonth.get(m);
		firstCol = d - 8 < 0 ? (d-8)*-1 : d-8;
		numOfCols = 1;
		numOfCols += (numOfDays-firstCol) / 7 ;
		numOfCols += (numOfDays-firstCol) % 7 == 0? 0 : 1;
		System.out.println(numOfCols);
		

	}

}
