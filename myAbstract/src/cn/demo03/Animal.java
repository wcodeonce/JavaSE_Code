package cn.demo03;
/*
    抽象类
 */
public abstract class Animal {

    //成员变量
    private int age = 20;                   //变量
    private final String city = "北京";      //常量

    //构造方法
    public Animal() {}

    //带参构造方法
    public Animal(int age) {
        this.age = age;
    }

    //抽象类可以有构造方法,用于子类访问父类的初始化

    //成员方法
    public void show() {
        age = 40;
        System.out.println(age);
//        city = "上海";
        System.out.println(city);
    }

    public abstract void eat();
    //抽象类中可以包含成员方法,可以是抽象的也可以是非抽象的



}
