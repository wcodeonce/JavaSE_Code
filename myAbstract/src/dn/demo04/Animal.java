package dn.demo04;
/*
    需求:
        请采用抽象类思想实现猫和狗的案例,并在测试类中进行测试
 */
/*
    思路:
        1.定义动物类(Animal)
            成员变量: 姓名,年龄
            构造方法: 无参,带参
            成员方法: get/set方法, 吃饭();
        2.定义猫类(Cat),继承动物类
            构造方法: 无参,带参
            成员变量: 重写吃饭(){...}
        3.定义狗类(Dog),继承动物类
            构造方法: 无参,带参
            成员变量: 重写吃饭方法(){...}
        4.定义测试类(AnimalDemo),写代码测试
 */


public abstract class Animal {

    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
