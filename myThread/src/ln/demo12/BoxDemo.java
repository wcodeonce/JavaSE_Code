package ln.demo12;

/**
 * @Author WTIHK
 * @Date 2021/1/8
 */

/*
    生产者消费者案例中包含的类：

        - 奶箱案例（Box）：定义一个成员变量，表示第X瓶奶，提供存储牛奶和获取牛奶的操作
        - 生产者类（Producer）：实现 Runnable接口，重写 run()方法，调用存储牛奶的操作
        - 消费者类（Customer）：实现 Runnable接口，重写 run()方法，调用取牛奶的操作
        - 测试类（BoxDemo）：里面有 main方法， main方法中的代码步骤如下
              1. 创建奶箱对象，这是共享数据区域
              2. 创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
              3. 创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
              4. 创建2个线程对象，分别把生产者对象和消费者对象作为构造法方法参数传递
              5. 启动线程
 */

public class BoxDemo {
    public static void main(String[] args) {

        //创建奶箱对象，这是共享数据区域
        Box b  = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);

        //创建消费者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用获取牛奶的操作
        Customer c = new Customer(b);

        //创建2个线程对象，分别把生产者对象和消费者对象作为构造法方法参数传递
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        //启动线程
        t1.start();
        t2.start();
    }
}
