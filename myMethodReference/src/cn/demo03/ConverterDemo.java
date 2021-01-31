package cn.demo03;

/**
 * @Author WTIHK
 * @Date 2021/1/29
 */

/*
    定义一个接口 ( Converter )，里面定义一个抽象方法
        int convert(String s);
    定义一个测试类 ( ConverterDemo ) ，在测试类中提供两个方法
        一个方法是：useConverter(Converter C)
        一个方法是主方法，在主方法中调用 useConverter 方法
 */

public class ConverterDemo {
    public static void main(String[] args) {

        //在主方法中调用 useConverter 方法

        //Lambda表达式
//        useConverter((String s) ->{
//            return Integer.parseInt(s);
//        });

        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        useConverter(Integer::parseInt);

        //


    }

    private static void useConverter(Converter c){
        int number = c.convert("666");
        System.out.println(number);
    }

}
