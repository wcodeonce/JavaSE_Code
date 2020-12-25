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
        把 "D:\\FileDemo\\TK.jpg" 复制到模块目录下的 TK.jpg

    思路：
        1.根据数据源创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        4.释放资源
 */

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {

        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\\\FileDemo\\\\TK.jpg");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\TK.jpg");

        //读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
