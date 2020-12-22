package bn.demo02;

public interface Inter {
    //接口中的成员变量只能是常量
    public int num = 10;
    public final int num2 = 20;

//    public static final num3 = 30;
    int num3 = 30;

//    public Inter() {}
    //接口里面不能有构造方法

//    public void show() {}
    //接口里面不能有非抽象方法

    public abstract void method();
    //接口里面的方法体只能是抽象的

    void show();
}

