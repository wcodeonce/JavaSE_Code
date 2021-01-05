package en.demo05;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    方式2：实现 Runnable 接口
        1 定义一个类 MyRunnable 实现 Runnable 接口
        2 在 MyRunnable 类中重写 run() 方法
        3 创建 MyRunnable 类的对象
        4 创建 Thread 类的对象，把 MyRunnable 对象作为构造方法的参数
        5 启动线程

 */

public class MyRunnableDemo {
    public static void main(String[] args) {

        //创建 MyRunnable 类的对象
        MyRunnable my = new MyRunnable();

        //创建 Thread 类的对象，把 MyRunnable 对象作为构造方法的参数
        //Thread(Runnable target)
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);

        //Thread (Runnable target, String name)
        Thread t1 = new Thread(my, "卧龙");
        Thread t2 = new Thread(my, "凤雏");

        //启动线程
        t1.start();
        t2.start();

    }
}
