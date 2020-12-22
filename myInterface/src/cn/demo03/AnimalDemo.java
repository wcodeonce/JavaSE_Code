package cn.demo03;

import javax.sound.midi.Soundbank;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象,调用方法
        Jumpping j = new Cat();
        j.jump();
        //接口不能调用get/set方法

        System.out.println("--------------");

        Animal a = new Cat();
        a.setName("汤姆");
        a.setAge(3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
//        a.jump();
//        ((Cat)a).jump();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("----------------");

        Cat c = new Cat();
        c.setName("汤姆");
        c.setAge(3);
        System.out.println(c.getName() + ", " + c.getAge());
        c.eat();
        c.jump();

        System.out.println("-------------------------");

        //创建对象,调用方法
        Jumpping d = new Dog();
        d.jump();
        //接口不能调用get/set方法

        System.out.println("--------------");

        a = new Dog();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
//        a.jump();
//        ((Cat)a).jump();

        a = new Dog("小黑", 5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("----------------");

        Dog g = new Dog();
        g.setName("旺财");
        g.setAge(3);
        System.out.println(c.getName() + ", " + c.getAge());
        g.eat();
        g.jump();



    }
}
