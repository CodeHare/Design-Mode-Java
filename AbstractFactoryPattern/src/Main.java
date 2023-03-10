public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("YELLOW");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

        Color color4 = colorFactory.getColor("GREEN");
        color4.fill();

        Color color5 = colorFactory.getColor("ORANGE");
        color5.fill();
    }
}