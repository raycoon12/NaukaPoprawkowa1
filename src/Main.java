//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(100, 10);
        Point point2 = new Point(150, 190);
        Point point3 = new Point(50, 190);

        Segment s1 = new Segment(point1, point2);
        Segment s2 = new Segment(point2, point3);
        Segment s3 = new Segment(point1, point3);

        Polygon polygon = new Polygon(new Point[]{point1,point2,point3});
        System.out.println(polygon.toSvg());
    }
}