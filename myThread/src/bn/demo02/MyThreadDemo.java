package bn.demo02;

/**
 * @Author WTIHK
 * @Date 2021/1/5
 */

/*
    Thread类中设置和获取线程名称的方法
         void  setName(String name) ：键此线程的名称更改为等于参数 name
         String getName()：返回此线程的名称
 */

public class MyThreadDemo {
    public static void main(String[] args) {

//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        //void  setName(String name) ：键此线程的名称更改为等于参数 name
//        my1.setName("主线程");
//        my2.setName("次线程");

        //Thread(String name)
        MyThread my1 = new MyThread("主线程");
        MyThread my2 = new MyThread("次线程");


        my1.start();
        my2.start();


        //static Thread currentThread() 返回对当前正在执行的线程对象的引用。
        System.out.println(Thread.currentThread().getName());

    }
}
