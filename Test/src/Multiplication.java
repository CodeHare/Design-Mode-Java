public class Multiplication implements Strategy {

    @Override
    public int doOperation(int number1, int number2) {
        return number1 * number2;
    }
}
