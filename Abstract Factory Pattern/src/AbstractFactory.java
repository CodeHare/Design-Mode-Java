/**
 * 为 Shape 及 Color 创建抽象类
 * */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}