package an.demo01;

import java.io.PrintStream;

/**
 * @Author WTIHK
 * @Date 2020/12/29
 */

/*
    public static final PrintStream out "标准"输出流。此流已经打开并准备号接收数据。通常，此流对应于显示输出或由主机环境或用户指定的另一个输出目标

 */

public class SystemOutDemo {
    public static void main(String[] args) {

        //public static final PrintStream out "标准"输出流
        PrintStream ps = System.out;

        //能够方便打印各种数据值
//        ps.print("Hello");
//        ps.print(100);

//        ps.println("Hello");
//        ps.println(100);

        //System.out的本质是一个自己输出流
        System.out.println("Hello");
        System.out.println(100);

        System.out.println();//带ln的可以不带参数
//        System.out.print();//不带ln的必须带参数

    }
}
