public class SvgScene {
    //private Polygon[] polygons;
    private Shape[] shapes;
    private int nextIndex;
    public SvgScene() {
        //this.polygons = new Polygon[3];
        this.shapes = new Shape[10];
        this.nextIndex = 0;
    }
    public void addShape(Shape shape) {
        shapes[nextIndex] = shape;
        nextIndex = (nextIndex + 1) % shapes.length;
    }
    public String toSvg() {
        String result = "";
        for (Shape shape : shapes) {
            if (shape != null) {
                result += shape.toSvg() + "\n";
            }
        }
        return result;
    }
//    public void addPolygon(Polygon polygon) {
//        polygons[nextIndex] = polygon;
//        nextIndex = (nextIndex + 1) % polygons.length;
//    }
//    public String toSvg() {
//        String result = "";
//        for (Polygon polygon : polygons) {
//            if (polygon != null) {
//                result += polygon.toSvg() + "\n";
//            }
//        }
//        return result;
//    }


}