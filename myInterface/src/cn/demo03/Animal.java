package cn.demo03;
/*
    需求:
        对猫和狗进行迅雷,他们可以跳高了,这里加入了跳高功能,请采用抽象类和接口来实现案例
        并在测试类中进行测试
 */
/*
    思路:
        1.定义接口(Jumpping)
            成员变量: 跳高();
        2.定义抽象动物类(Animal)
            成员变量: 姓名,年龄;构造方法:无参,带参;成员方法:get/set方法,吃饭();
        3.定义具体的猫类(Cat),继承动物类,实现跳高接口
            构造方法:无参,带参;成员方法:重写吃饭(){...},重写跳高方法(){...}
        4.定义狗类(Dog),继承动物类,实现跳高接口
            构造方法:无参,带参;成员方法:重写吃饭(){...},重写跳高方法(){...}
        5.定义测试类(AnimalDemo),写代码测试
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
