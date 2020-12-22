package bn.demo02;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //抽象类不能创建对象
//      Animal a = new Animal();

        Animal a = new Cat();
        a.eat();
        a.sleep();

    }
}
