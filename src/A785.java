import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,sol = 0;
        String x;

        Map<String,Integer> polyhedrons = new HashMap<>();
        polyhedrons.put("Tetrahedron",4);
        polyhedrons.put("Cube",6);
        polyhedrons.put("Octahedron",8);
        polyhedrons.put("Dodecahedron",12);
        polyhedrons.put("Icosahedron",20);


        n = in.nextInt();

        for(int i=0;i<n;i++){
            x = in.next();
            sol += polyhedrons.get(x);
        }

        System.out.println(sol);


    }
}
