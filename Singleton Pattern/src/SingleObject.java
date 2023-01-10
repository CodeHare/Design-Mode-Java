public class SingleObject {
    // 创建一个 SingleObject 对象
    private static SingleObject instance = new SingleObject();
    // 给构造函数前面加 private 关键字，此时这个类就不会被实例化
    private SingleObject(){}

    // 获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("This is a singleton");
    }
}
