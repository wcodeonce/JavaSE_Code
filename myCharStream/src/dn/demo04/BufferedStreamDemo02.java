package dn.demo04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/28
 */

/*
    字符缓冲流特有功能

        BufferedWriter：
            void newLine()：写一行分隔符，行分隔符字符串由系统属性定义

        BufferedReader：
            public String readLine()：读一行文字。结果包含行的内容的字符串，不包括任何终止字符，如果流的结尾以及到达，则为null
 */

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {

        /*
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));

        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("Hello" + i);
//            bw.write("\r\n");
            //void newLine()：写一行分隔符，行分隔符字符串由系统属性定义
            bw.newLine();
            bw.flush();
        }


        //释放资源
        bw.close();

         */


        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

        //public String readLine()：读一行文字。结果包含行的内容的字符串，不包括任何终止字符，如果流的结尾以及到达，则为null

        /*
        //第一次读数据
        String line = br.readLine();
        System.out.println(line);

        //第二次读取数据
        line = br.readLine();
        System.out.println(line);

        //多读两次
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
         */

        String line;
        while ((line = br.readLine()) != null) {
            //一次读一行数据,只读内容,不读换行符号
            System.out.println(line);
        }

        //释放资源
        br.close();

    }
}
