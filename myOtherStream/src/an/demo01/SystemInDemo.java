package an.demo01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author WTIHK
 * @Date 2020/12/29
 */

/*
    public static final InputStream in "标准"输入流，该流已经打开，准备提供输入数据。通常，该流对应于键盘输入或有主机环境或用户指定的另一个输入源

 */

public class SystemInDemo {
    public static void main(String[] args) throws IOException {

        //public static final InputStream in "标准"输入流
//        InputStream is = System.in;

        //读汉字不方便
//        int by;
//        while ((by = is.read()) != -1) {
//            System.out.print((char) by);
//        }

        //如何把字节流转换为字符流? 用转换流
//        InputStreamReader isr = new InputStreamReader(is);

        //使用字符流能不能够一次读取一行数据? 可以
        //但是,一次读取一行数据的方法是字符缓冲输入流的特有方法
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串:");
        String line = br.readLine();
        System.out.println("你输入的字符串是:" + line);

        System.out.println("请输入一个整数:");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是:" + i);

        //自己实现键盘录入数据太麻烦了,所有Java提供了一个类供我们使用
        Scanner sc = new Scanner(System.in);


    }
}
