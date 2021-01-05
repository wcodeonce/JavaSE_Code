package cn.demo03;

/**
 * @Author WTIHK
 * @Date 2021/1/5
 */

/*
    Thread 类中设置和获取线程优先级的方法
        - public final int getPriority()：返回此线程的优先级
        - public final void setPriority(int newPriority)：更改此线程的优先级
 */

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");


        //public final int getPriority()：返回此线程的优先级
//        System.out.println(tp1.getPriority());  //5
//        System.out.println(tp2.getPriority());  //5
//        System.out.println(tp3.getPriority());  //5


        //public final void setPriority(int newPriority)：更改此线程的优先级
//        tp1.setPriority(10000);  //IllegalArgumentException
//        System.out.println(Thread.MAX_PRIORITY);  //最高10
//        System.out.println(Thread.MIN_PRIORITY);  //最低1
//        System.out.println(Thread.NORM_PRIORITY);  //默认5


        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(1);
        tp3.setPriority(10);


        tp1.start();
        tp2.start();
        tp3.start();


    }
}
