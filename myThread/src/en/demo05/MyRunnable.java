package en.demo05;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    定义一个类 MyRunnable 实现 Runnable 接口
 */

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
