package gn.demo06;

/**
 * @Author WTIHK
 * @Date 2021/1/26
 */

/*
    Lambda表达式的注意事项
 */

public class LambdaDemo {
    public static void main(String[] args) {

//        useInter(() -> {
//            System.out.println("你好，Java   );
//        });

        //使用Lambda必须要有接口，并且要求接口中有且只有一个抽象方法
        useInter(() -> System.out.println("好好学习，天天向上"));

        //必须有上下文环境，才能推到出Lambda对应的接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();


//        Runnable r = () -> System.out.println("Lambda表达式");
//        new Thread(r).start();

        new Thread(() -> System.out.println("Lambda表达式")).start();


    }

    private static void useInter(Inter i) {
        i.show();
    }

}
