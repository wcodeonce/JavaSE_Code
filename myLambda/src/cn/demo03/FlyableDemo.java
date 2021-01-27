package cn.demo03;

/**
 * @Author WTIHK
 * @Date 2021/1/26
 */

/*
    练习二
        1.定义一个接口（Flyable），里面定义一个抽象方法：void fly(String s);
        2.定义一个测试类（FlyableDemo），在测试类中提供两个方法
          一个方法是：useFlyable(Flyable f)
          一个方法是主方法：在主方法中调用 useFlyable 方法
 */

public class FlyableDemo {
    public static void main(String[] args) {

        //在主方法中调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("海上冲浪");
            }
        });

        System.out.println("------------------------");

        //Lambda 表达式改进
        useFlyable((String s) -> {
            System.out.println(s);
            System.out.println("网上冲浪");
        });


    }

    private static void useFlyable(Flyable f) {

        f.fly("乘风破浪");

    }

}
