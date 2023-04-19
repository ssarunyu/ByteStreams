package bytestreams;

//ใช้ตกแต่งเส้นขอบฟังชันก์การทำงานของ object นั้นๆ
public class PinkShapeDecorator extends ShapeDecorator {
    public PinkShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Pink");
    }
}