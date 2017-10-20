import java.util.*;

public class B16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumOfMatchBoxes, numOfContainters;

        int matchBox, capcity;
        int sol = 0;

        List<Container> containers;

        maxNumOfMatchBoxes = input.nextInt();
        numOfContainters = input.nextInt();

        containers = new ArrayList<>();


        for (int i = 0; i < numOfContainters; i++) {
            matchBox = input.nextInt();
            capcity = input.nextInt();
            Container container = new Container(matchBox, capcity);

            containers.add(container);

        }


        Collections.sort(containers, Container.capacityCompartor);


        int remain = maxNumOfMatchBoxes;
        for (Container c : containers) {

            if (remain > 0) {
                if (remain >= c.getNumOfMatchs()) {
                    sol += c.getNumOfMatchs() * c.getCopacity();
                } else if (remain < c.getNumOfMatchs()) {
                    sol += remain * c.getCopacity();
                }
                remain = remain - c.getNumOfMatchs();
            } else {
                break;
            }

        }

        System.out.println(sol);

    }
}

class Container {
    int numOfMatchs;
    int copacity;


    public static Comparator<Container> capacityCompartor = (c1, c2) -> c2.copacity - c1.copacity;

    public Container(int numOfMatchs, int copacity) {
        this.numOfMatchs = numOfMatchs;
        this.copacity = copacity;
    }

    public int getNumOfMatchs() {
        return numOfMatchs;
    }

    public void setNumOfMatchs(int numOfMatchs) {
        this.numOfMatchs = numOfMatchs;
    }

    public int getCopacity() {
        return copacity;
    }

    public void setCopacity(int copacity) {
        this.copacity = copacity;
    }
}
