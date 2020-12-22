package cn.demo05;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象,进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Cat("汤姆", 3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        //创建狗类对象,进行测试
        Animal d = new Dog();
        d.setName("旺财");
        d.setAge(3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();

        d = new Dog("旺财", 2);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
    }
}
