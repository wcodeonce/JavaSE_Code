package cn.demo02;

public class Student {
    //非静态成员变量
    private String name = "小明";
    //静态成员变量
    private static String university = "清华大学";

    //非静态成员 方法
    public void show1() {

    }

    //非静态成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员变量
    public static void show3() {

    }

    //静态成员变量
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }

}
