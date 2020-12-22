package Demo09;
/*
    需求：
        定义一个老师类和学生类，然后写代码测试；
        最后找到老师类和学生类当中的共性内容，抽取出一个父类，用继承的方式改写代码
        并进行测试
 */
/*
    思路：
        1.定义老师类（姓名，年龄，教书（））
        2.定义学习类（姓名，年龄，学习（））
        3.定义测试类，写代码测试
        4.共性抽取父类，定义人类（姓名，年龄）
        5.定义老师类，继承人类，并给出自己特有的方法： 教书()
        6.定义学生类，继承人类，并给出自己特有的方法： 学习()
        7.定义测试类，写代码测试
 */
public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
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

    public void study() {
        System.out.println("好好学习，天天向上");
    }
}
