import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B66 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int[] x;
        int max = -1;
        List<Section> sections;
        Section section;

        n = input.nextInt();
        sections = new ArrayList<>(n);
        x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
        }


        int j;
        int prev;
        int next;
        for (int i = 0; i < n; i++) {
            section = new Section();


            //current
            section.addToNext();

            //prev
            j = i;
            while (j > 0 && x[j-1] <= x[j]) {
                section.addToPrev();
                j--;
            }

            //next
            j = i;
            while (j < n - 1 && x[j+1] <= x[j]) {
                section.addToNext();
                j++;
            }

            sections.add(section);

        }


        for (Section s : sections) {
            if (s.getSum() > max) max = s.getSum();
        }

        System.out.println(max);


    }

    static class Section {
        int prev;
        int next;
        int sum;

        public Section() {
            prev = 0;
            next = 0;
            sum = 0;
        }

        public void addToPrev() {
            prev++;
            sum++;
        }

        public void addToNext() {
            next++;
            sum++;
        }

        public int getSum() {
            return sum;
        }

    }
}
