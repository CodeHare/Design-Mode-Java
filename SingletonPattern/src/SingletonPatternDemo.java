public class SingletonPatternDemo {
    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误： SingleObject() 在 SingleObject 中是 private 访问控制
        // SingleObject singleObject = new SingleObject();

        // 获取唯一可用对象
        SingleObject singleObject = SingleObject.getInstance();

        // 显示消息
        singleObject.showMessage();
    }
}
