import java.util.*;

public class B538 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        while (n > 0) {
            int num = n;
            int p = 1;
            int add = 0;
            while (num > 0) {
                //	System.out.println(num);
                if (num % 10 != 0) {
                    add += p;
                }
                num /= 10;
                p *= 10;
            }
            n -= add;
            l.add(add);
        }
        System.out.println(l.size());
        for (int num : l) {
            System.out.print(num + " ");
        }

    }

    static Set<Integer> getAllPossipalities(int num) {
        Set<Integer> possipalities = new HashSet<>();
        int n = 1;
        possipalities.add(n);
        while (n < num) {
            possipalities.add(n * 10);
            possipalities.add((n * 10) + 1);
            n *= 10;
        }
        if(n==num) possipalities.add(num);

        return possipalities;
    }
}