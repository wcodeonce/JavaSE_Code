package dn.demo04;

/**
 * @Author WTIHK
 * @Date 2021/1/31
 */

/*
    练习:
        定义一个类（PrintString），里面定义一个方法
            public void printUpper(String s) ：把字符串参数编程大写的数据，然后再控制台输出
        定义一个接口（PrinterDemo），里面定义一个抽象方法
            void printUpperCase(String s)
        定义一个测试类（PrinterDemo），在测试类中提供两个方法
            一个方法是：usePrinter(Printer p)
            一个方法是主方法，在主方法中调用 usePrinter方法
 */

public class PrinterDemo {
    public static void main(String[] args) {

        //在主方法中调用 usePrinter方法

        //Lambda表达式
//        usePrinter((String s) -> {
////            String result = s.toUpperCase();
////            System.out.println(result);
//            System.out.println(s.toUpperCase());
//        });

        usePrinter(s -> System.out.println(s.toUpperCase()));

        //方法对象的实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        //Lambda表达式被对象的实例方法替代时，他的全部形式参数全部船体给该方法作为参数

    }

    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");
    }

}
