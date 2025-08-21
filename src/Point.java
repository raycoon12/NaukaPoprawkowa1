public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point oldPoint){
        this.x = oldPoint.x;
        this.y = oldPoint.y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point is {" + "x=" + x + ", y=" + y + "}";
    }

    public String toSvg(){
        return "<circle cx=\"" + x +
                "\" cy=\"" + y +
                "\" r=\"13\" fill=\"black\" />";
    }


    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy){
        return new Point(x+dx, y+dy);
    }
}
