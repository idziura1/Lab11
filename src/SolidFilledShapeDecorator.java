import java.util.Locale;

public class SolidFilledShapeDecorator extends ShapeDecorator{
    private String color;

    public SolidFilledShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }
    @Override
    public String toSVG(String prm) {
        String f = String.format(Locale.ENGLISH, " fill=\"%s\" %s", color, prm);
        return decoratedShape.toSVG(f);
    }
}
