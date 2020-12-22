package cn.demo01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "小小学";

        Student s1 = new Student();
        s1.name = "小明";
        s1.age = 18;
//        s1.university = "小小学";
        s1.show();

        Student s2 = new Student();
        s2.name = "小红";
        s2.age = 20;
//        s2.university = "小小学";
        s2.show();

    }
}
