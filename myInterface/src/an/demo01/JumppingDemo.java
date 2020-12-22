package an.demo01;

public class JumppingDemo {
    public static void main(String[] args) {

        //接口本身也是抽象的内容,不能被实例化
//        Jumpping j = new Jumpping();

        Jumpping j = new Cat();
        j.jump();

    }
}
