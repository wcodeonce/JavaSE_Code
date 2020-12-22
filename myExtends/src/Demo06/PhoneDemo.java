package Demo06;
/*
    测试类
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象,调用方法
        Phone p = new Phone();
        p.call("小明");
        System.out.println("------------------------");

        NewPhone np = new NewPhone();
        np.call("小明");

    }
}
