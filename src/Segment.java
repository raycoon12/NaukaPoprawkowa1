public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = new Point(point1);
        this.point2 = new Point(point2);
    }

    public Point getPoint1() {
        return new Point(point1);
    }
    public Point getPoint2() {
        return new Point(point2);
    }

    public double length(){
        return Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)
                + Math.pow(point2.getY()-point1.getY(),2));
    }

    public static Segment findLongestSegment(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return null;
        }
        Segment longest = segments[0];
        for (Segment s : segments) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    @Override
    public String toString() {
        return "Segment {" +
                "point1 = " + point1 +
                ", point2 = " + point2 +
                "}";
    }

    public Segment perpendicular(){
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();

        double mx = (x1 + x2) / 2.0;
        double my = (y1 + y2) / 2.0;

        double dx = x2 - x1;
        double dy = y2 - y1;

        double length = Math.sqrt(dx * dx + dy * dy);

        if (length == 0) {
            throw new IllegalStateException("Odcinek ma zerową długość – nie można utworzyć prostopadłego");
        }

        double px = -dy;
        double py = dx;

        double scale = (length / 2.0) / Math.sqrt(px * px + py * py);
        px *= scale;
        py *= scale;

        Point q1 = new Point(mx + px, my + py);
        Point q2 = new Point(mx - px, my - py);

        return new Segment(q1, q2);
    }


}
