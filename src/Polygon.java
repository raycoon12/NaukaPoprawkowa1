import java.util.Arrays;

public class Polygon {
    private Point[] points;
    Style style;

    public Polygon(Point[] points, Style style) {
        this.style = style;
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }
    public Polygon(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
        this.style = new Style("transparent", "black", 1.0);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public String toSvg() {
        String svg = "<polygon points=\"";
        for (int i = 0; i < points.length; i++) {
            svg += points[i].getX() + "," + points[i].getY();
            if (i < points.length - 1) {
                svg += " ";
            }
        }
        svg += "\" style=\"" + style.toSvg() + "/>";
        return svg;
    }

    public BoundingBox boundingBox() {
        double minX = Double.MAX_VALUE;
        double maxX = Double.MIN_VALUE;
        double minY = Double.MAX_VALUE;
        double maxY = Double.MIN_VALUE;

        for (Point p : points) {
            minX = Math.min(minX, p.getX());
            maxX = Math.max(maxX, p.getX());
            minY = Math.min(minY, p.getY());
            maxY = Math.max(maxY, p.getY());
        }

        return new BoundingBox(minX, minY, maxY - minY, maxX - minX);
    }
    public static Polygon square(Segment segment, Style style){
        Point p1 = segment.getPoint1();
        Point p2 = segment.getPoint2();

        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        double mx = (x1 + x2) / 2.0;
        double my = (y1 + y2) / 2.0;

        double dx = x2 - x1;
        double dy = y2 - y1;

        double px = -dy;
        double py = dx;

        double scale = 0.5;
        px *= scale;
        py *= scale;

        Point p3 = new Point(mx + px, my + py);
        Point p4 = new Point(mx - px, my - py);

        Point[] squarePoints = { p1, p3, p2, p4 };
        return new Polygon(squarePoints, style);
    }

}
