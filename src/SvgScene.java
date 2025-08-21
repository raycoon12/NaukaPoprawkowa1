public class SvgScene {
    private Polygon[] polygons;
    private int nextIndex;

    public SvgScene() {
        this.polygons = new Polygon[3];
        this.nextIndex = 0;
    }
    public void addPolygon(Polygon polygon) {
        polygons[nextIndex] = polygon;
        nextIndex = (nextIndex + 1) % polygons.length;
    }

    public String toSvg() {
        String result = "";
        for (Polygon polygon : polygons) {
            if (polygon != null) {
                result += polygon.toSvg() + "\n";
            }
        }
        return result;
    }


}
