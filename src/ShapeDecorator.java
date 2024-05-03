public class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public String toSVG(String prm) {
        return decoratedShape.toSVG(prm);
    }
}
