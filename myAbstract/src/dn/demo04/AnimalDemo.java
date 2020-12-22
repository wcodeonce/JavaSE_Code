package dn.demo04;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //创建对象,按照多态的方式
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("--------------------------");

        a = new Cat("汤姆", 3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("---------------------------");

        a = new Dog();
        a.setName("旺财");
        a.setAge(3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Dog("旺财", 3);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();



    }
}
