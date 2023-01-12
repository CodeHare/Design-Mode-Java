public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) return null;
        if (colorType.equalsIgnoreCase("RED")) return new RedColor();
        if (colorType.equalsIgnoreCase("GREEN")) return new GreenColor();
        if (colorType.equalsIgnoreCase("BLUE")) return new BlueColor();
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
