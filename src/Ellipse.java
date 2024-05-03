import java.util.Locale;

public class Ellipse implements Shape{
    private Vec2 center;
    private double rx;
    private double ry;

    public Ellipse(Style style, Vec2 center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;

    }

    @Override
    public String toSVG(String prm) {
        return String.format(Locale.ENGLISH,"\n<ellipse cx='%f' cy='%f' rx='%f' ry='%f' %s />",
                this.center.x, this.center.y, this.rx, this.ry, prm);
    }
}
