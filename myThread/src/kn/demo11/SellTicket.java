package kn.demo11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    Lock 中提供了获得锁和释放锁的方法
        void lock()：获得锁
        void unlock()：释放锁

    Lock 时接口不能直接实例化，这里采用他的实现类 ReentrantLock 来实例化
    ReentrantLock 的构造方法
        ReentrantLock()：创建一个 ReentrantLock 的实例
 */

public class SellTicket implements Runnable {

    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第:" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
