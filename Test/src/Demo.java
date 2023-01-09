public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(10,4));

        context = new Context(new Multiplication());
        System.out.println(context.executeStrategy(10,4));

        context = new Context(new Subtraction());
        System.out.println(context.executeStrategy(10,4));
    }
}
