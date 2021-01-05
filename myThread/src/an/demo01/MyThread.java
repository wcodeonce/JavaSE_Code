package an.demo01;

/**
 * @Author WTIHK
 * @Date 2021/1/5
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
