//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(100, 10);
        Point point2 = new Point(150, 190);
        Point point3 = new Point(50, 290);
        Point point4 = new Point(200, 200);

        Point[] points = {point1, point3, point2};

        Style style = new Style("purple", "white", 4);
        Ellipse ellipse = new Ellipse(style, point4, 100, 50);
        Polygon polygon = new Polygon(points, style);
        SvgScene svgScene = new SvgScene();
        svgScene.addShape(ellipse);
        svgScene.addShape(polygon);
        System.out.println(svgScene.toSvg());
    }
}