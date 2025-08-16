//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(3, 0);
        Point point2 = new Point(-1, -3);
        Point point3 = new Point(10, 10);

        Segment s1 = new Segment(point1, point2);
        Segment s2 = new Segment(point2, point3);
        Segment s3 = new Segment(point1, point3);

        Segment[] segments = {s1, s2, s3};

        System.out.println(point1.toString());
        System.out.println(point2.toString());

        System.out.println(s1.length());

        Segment longest = Segment.findLongestSegment(segments);
        System.out.println("Najdłuższy odcinek ma długość: " + longest.length());
    }
}