package bytestreams;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Blue");
    }
}
