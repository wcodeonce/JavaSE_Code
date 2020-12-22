package Demo11;
/*
    需求：
        请采用继承的思想实现猫和狗的案例，并在测试类中进行测试
 */
/*
    分析：
        1.猫：
            成员变量：姓名，年龄
            构造方法：无参，带参
            成员方法：get/set方法，抓老鼠()
        2.狗：
            成员变量：姓名，年龄
            构造方法：无参，带参
            成员方法：get/set方法，看门()
        3.共性：
            成员变量：姓名，年龄
            构造方法：无参，带参
            成员方法：get/set方法
 */
/*
    思路：
        1.定义动物类（Animal）
            成员变量：姓名，年龄
            构造方法：无参，带参
            成员方法：get/set方法
        2.定义猫类（Cat），继承动物类
            构造方法：无参，带参
            成员方法：抓老鼠（）
        3.定义狗类（Dog），继承动物类
            构造方法：无参，带参
            成员方法：看门（）
        4.定义测试类（AnimalDemo），写代码测试
 */

//测试类

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象并进行测试
        Cat c1 = new Cat();
        c1.setName("汤姆猫");
        c1.setAge(3);
        System.out.println(c1.getName() + ", " + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫", 2);
        System.out.println(c2.getName() + ", " + c2.getAge());
        c2.catchMouse();

        //创建狗类对象并进行测试
        Dog d1 = new Dog();
        d1.setName("旺财");
        d1.setAge(4);
        System.out.println(d1.getName() + ", " + d1.getAge());
        d1.lookDoor();

        Dog d2 = new Dog("小黑", 3);
        System.out.println(d2.getName() + ", " + d2.getAge());
        d2.lookDoor();

    }
}
