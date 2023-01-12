public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color colorRed = colorFactory.getColor("RED");
        colorRed.fill();

        Color colorBlue = colorFactory.getColor("BLUE");
        colorBlue.fill();

        Color colorGreen = colorFactory.getColor("GREEN");
        colorGreen.fill();
    }
}