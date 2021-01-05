package cn.demo03;

/**
 * @Author WTIHK
 * @Date 2021/1/5
 */

public class ThreadPriority extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
