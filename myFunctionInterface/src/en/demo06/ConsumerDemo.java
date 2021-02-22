package en.demo06;

import java.util.function.Consumer;

/**
 * @Author WTIHK
 * @Date 2021/2/2
 */

/*
    Consumer<T>：包含两个方法
        void accept(T t)：对给定的参数执行此操作
        default Consumer<T> andThen(Consumer after)：返回一个组合的 Consumer，依次执行此操作，然后执行 after 操作
        Consumer<T> 接口也被称为消费性接口，它消费的数据的数据类型有泛型执行
 */

public class ConsumerDemo {
    public static void main(String[] args) {

        //调用方法
//        operatorString("胖虎", (String s) -> {
//            System.out.println(s);
//        });

        operatorString("大雄", s -> System.out.println(s));

//        operatorString("大雄", System.out::println);

//        operatorString("静香", s -> {
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });

        operatorString("静香", s -> System.out.println(new StringBuilder(s).reverse().toString()));

        System.out.println("--------------------");

        operatorString("胖虎", s -> System.out.println(s), s -> System.out.println(
                new StringBuilder(s).reverse().toString()
        ));


    }

    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> conn) {
        conn.accept(name);
    }

    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }



}
