import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A365 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfArrays,k;
        String array;
        Set<Integer> numbersInArr;
        int sol =0;

        numOfArrays = input.nextInt();
        k = input.nextInt();

        for (int i=0; i < numOfArrays; i++){
            array = input.next();
            numbersInArr = new HashSet<>();
            for (Character c : array.toCharArray()){
                int num = Integer.valueOf(c.toString());
                if(num <= k) numbersInArr.add(num);
            }
            if(numbersInArr.size() > k) sol++;
        }

        System.out.println(sol);


    }
}
