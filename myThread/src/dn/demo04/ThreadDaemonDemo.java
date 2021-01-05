package dn.demo04;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    void setDaemon(boolean on) : 将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 */

public class ThreadDaemonDemo {
    public static void main(String[] args) {

        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("卧龙");
        td2.setName("凤雏");

        //设置主线程
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
