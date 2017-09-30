import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import static sun.swing.MenuItemLayoutHelper.max;

public class B158 {

    public static void main(String[] args) throws Exception {
        FastScanner scanner = new FastScanner(
                new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter outer = new PrintWriter(new BufferedOutputStream(System.out));
        int[] numOfGroupsCategories = new int[4];
        int rem;
        int numOfGroups;
        int res;

        Arrays.fill(numOfGroupsCategories,0);
        numOfGroups = scanner.nextInt();

        for(int i=0; i < numOfGroups; i++){
            int num = scanner.nextInt();
            if(num == 1){
                numOfGroupsCategories[num-1]+= 1;
            } else if(num == 2){
                numOfGroupsCategories[num-1]+= 2;
            } else if(num == 3){
                numOfGroupsCategories[num-1]+= 1;
            } else if(num == 4) {
                numOfGroupsCategories[num-1]+= 1;
            }
        }

        res = numOfGroupsCategories[0]/4
                + numOfGroupsCategories[1]/4
                + numOfGroupsCategories[2]
                + numOfGroupsCategories[3];

        rem = max(numOfGroupsCategories[0]);
        if(rem > 4) res++;


        outer.print(res);

        outer.close();
        scanner.close();
    }
}
