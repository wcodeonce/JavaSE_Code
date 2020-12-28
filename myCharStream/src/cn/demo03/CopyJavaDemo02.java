package cn.demo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/27
 */

/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    数据源和目的地的分析
        数据源：myCharStream\\ConversionStreamDemo.java —- 读数据 —- Reader —- InputStreamReader —- FileReader
        目的地：myCharStream\\Copy.java —- 写数据 —- Writer —- OutputStreamWriter —- FileWriter

    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的的创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源
 */


public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {

        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("myCharStream\\ConversionStreamDemo.java");

        //根据目的的创建字符输出流对象
        FileWriter fw = new FileWriter("myCharStream\\\\Copy.java");

        //读写数据，复制文件
        //一次读一个字符数据
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }


        //释放资源
        fr.close();
        fw.close();

    }
}
