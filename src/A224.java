import java.util.Scanner;

public class A224 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();
        long z=(long) Math.sqrt(a*b/c);
        long zz=(long) Math.sqrt(a*c/b);
        long zzz=(long) Math.sqrt(c*b/a);
        System.out.println(4*(z+zz+zzz));
    }
}
