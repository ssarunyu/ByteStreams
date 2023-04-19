package bytestreams;

public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        PinkShapeDecorator circleDecorator = new PinkShapeDecorator(circle);
        circleDecorator.draw();

        Rectangle rectangle = new Rectangle();
        BlueShapeDecorator rectanglDecorator = new BlueShapeDecorator(rectangle);
        rectanglDecorator.draw();
    }
}
