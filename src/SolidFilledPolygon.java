public class SolidFilledPolygon extends Polygon{
    private String fillColor;

    public SolidFilledPolygon(Vec2[] points, String fillColor) {
        super(points);
        this.fillColor = fillColor;
    }

    @Override
    public String toSVG(String prm) {
        String f=String.format("fill=\"%s\" %s ", fillColor, prm);
        return super.toSVG(f);
    }
}
