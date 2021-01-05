package an.demo01;

/**
 * @Author WTIHK
 * @Date 2021/1/5
 */

/*
    方式1：继承 Thread 类
        1- 定义一个类 MyThread 继承 Thread 类
        2- 在 MyThread 类中重写 run() 方法
        3- 创建 MyThread 类的对象
        4- 启动线程
 */

public class MyThreadDemo {
    public static void main(String[] args) {

        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();

        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
        my1.start();
        my2.start();

    }
}
