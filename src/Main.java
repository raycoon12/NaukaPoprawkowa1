//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(100, 10);
        Point point2 = new Point(150, 190);
        Point point3 = new Point(50, 290);
        Point point4 = new Point(200, 200);


        Segment segment = new Segment(point1, point3);
        Style style = new Style("purple", "white", 4);
        System.out.println(Polygon.square(segment,style).toSvg());
    }
}