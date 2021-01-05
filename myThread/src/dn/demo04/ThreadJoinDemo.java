package dn.demo04;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    void join() : 等待这个线程死亡
 */

public class ThreadJoinDemo {
    public static void main(String[] args) {

        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("关羽");
        tj2.setName("刘备");
        tj3.setName("张飞");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();

    }
}
