import java.util.*;

public class A165 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        List<Point> points = new ArrayList<>();
        size = in.nextInt();
        for (int i = 0; i<size; i++){
            Point point = new Point(in.nextInt(),in.nextInt());
            points.add(point);
        }

        for (int i=0; i < size; i++) {
            Point p = points.get(i);
            for (int j=0; j < size; j++){
                if(p.x == points.get(j).x && p.y < points.get(j).y ) points.get(i).greaterY = true;
                else if (p.x == points.get(j).x && p.y > points.get(j).y) points.get(i).smallerY = true;
                else if (p.y == points.get(j).y && p.x < points.get(j).x) points.get(i).greaterX = true;
                else if (p.y == points.get(j).y && p.x > points.get(j).x) points.get(i).smallerX = true;
            }
        }

        int result=0;
        for (Point p: points) {
            if(p.smallerX && p.smallerY && p.greaterX && p.greaterY) result++;
        }
        System.out.println(result);

    }
}

class Point {
    public int x;
    public int y;
    public boolean greaterX = false;
    public boolean smallerX = false;
    public boolean greaterY = false;
    public boolean smallerY = false;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
