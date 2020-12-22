package an.demo01;

public class Cat implements Jumpping{
    //类实现接口用关键字 implements

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
