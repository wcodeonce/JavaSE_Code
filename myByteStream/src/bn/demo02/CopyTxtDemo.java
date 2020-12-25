package bn.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    需求：
        把"D:\\FileDemo\\JavaSE.txt"复制到模块目录下的"JavaSE.txt"

    分析：
        复制文本文件，其实就是把文本文件的内容从一个文件中读取出来（数据源），然后写入到另一个文件中（目的地）

        数据源：
            D:\\FileDemo\\JavaSE.txt ----读数据 ----InputStream ----FileInputStream
        目的的:
            myByteStream\\JavaSE.txt ----写数据 ----OutputStream ----FileInputStream

    思路：
        1.根据数据源创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
        4.释放资源
 */

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {

        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\\\FileDemo\\\\JavaSE.txt");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\\\JavaSE.txt");

        //读写数据，复制文本文件（一次读取一个字节，一次写入一个字节）
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
