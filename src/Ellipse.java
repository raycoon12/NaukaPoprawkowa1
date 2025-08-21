public class Ellipse extends Shape {
    private Point middle;
    private double rx;
    private double ry;

    public Ellipse(Style style, Point middle, double ry, double rx) {
        super(style);
        this.middle = new Point(middle);
        this.ry = ry;
        this.rx = rx;
    }

    public String toSvg() {
        String svg = new String("<ellipse rx=\"");
        svg += rx + "\" ry=\""
                + ry + "\" cx=\""
                + middle.getX() + "\" cy=\""
                + middle.getY() + "\""
                + " style=\"" + style.toSvg() + "/>";
        return svg;
    }

}
