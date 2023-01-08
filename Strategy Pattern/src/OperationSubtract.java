/**
 * 创建实现接口的实体类
 * */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int number1, int number2) {
        return number1 - number2;
    }
}
