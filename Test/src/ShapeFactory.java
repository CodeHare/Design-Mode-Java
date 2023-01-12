public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        if (shapeType.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (shapeType.equalsIgnoreCase(("SQUARE"))) return new Square();
        if (shapeType.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
