public class DemoTest {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Shape shapeCircle = new Circle();
        shapeCircle.draw();

        Shape shapeRectangle = new Rectangle();
        shapeRectangle.draw();

        Shape shapeSquare = new Square();
        shapeSquare.draw();

        Color green = new GreenColor();
        green.fill();

        Color red = new RedColor();
        red.fill();

        Color blue = new BlueColor();
        blue.fill();
    }
}
