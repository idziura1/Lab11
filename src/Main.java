
public class Main {
    public static void main(String[] args){
        Segment[] arr = new Segment[2];
        for(int i=0; i<2; i++){
            float x1, y1;
            float max = 5;
            float min = 1;
            x1 = (float)(Math.random() * (max - min)+ 1) + min;
            y1 = (float)(Math.random() * (max - min)+ 1) + min;
            SvgScene scene = SvgScene.getInstance();
            Shape ellipse = new Ellipse(new Style("red", "blue", 3), new Vec2(600, 600), 100, 100);
            ellipse = new SolidFilledShapeDecorator(ellipse, "red");
            ellipse = new DropShadowDecorator(ellipse);
            scene.addShape(ellipse);
            Shape square = Polygon.square(new Segment(new Vec2(428, 454), new Vec2(212, 658)));
            square = new GradientFillShapeDecorator.Builder()
                    .setShape(square)
                    .addStop(0, "black")
                    .addStop(0.3, "red")
                    .addStop(1, "white")
                    .build();
            square = new DropShadowDecorator(square);
            scene.addShape(square);
            Polygon polyS = new Polygon(new Vec2[]{new Vec2(200, 10), new Vec2(550, 50), new Vec2(100, 100)});

            TransformationDecorator.Builder builder = new TransformationDecorator.Builder(new SolidFilledShapeDecorator(polyS, "blue"));
            TransformationDecorator s = builder.rotate(new Vec2(0, 0), 30).scale(new Vec2(1, 1.5)).build();
            scene.addShape(s);
            scene.save("file.html");

        }
    }
}