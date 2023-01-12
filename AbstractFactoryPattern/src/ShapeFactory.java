public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if (shape == null) return null;
        if (shape.equalsIgnoreCase("CIRCLE")) return new CircleShape();
        if (shape.equalsIgnoreCase("RECTANGLE")) return new RectangleShape();
        if (shape.equalsIgnoreCase("SQUARE")) return new SquareShape();
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
