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
    public void setPoint1(Point point1) {
        this.point1 = new Point(point1);
    }

    public Point getPoint2() {
        return new Point(point2);
    }
    public void setPoint2(Point point2) {
        this.point2 = new Point(point2);
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
}
