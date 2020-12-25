package bn.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    需求：
        把文件 fos.txt 中的内容读取出来再控制台输出

    使用字节输入流读取数据的步骤：
        1. 创建字节输入流对象
        2. 调用字节输入流对象的读取方法
        3. 释放资源

 */

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {

        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");

/*
        //调用字节输入流对象的读取方法
        //int read(byte[] b) 从此输入流 b.length最多 b.length字节的数据读 b.length字节数组。
        byte[] bys = new byte[5];

        //第一次读取数据
        int len = fis.read(bys);
        System.out.println(len);
        //String (byte[] bytes);
//        System.out.println(new String(bys));
        System.out.println(new String(bys, 0 , len));


        //第二次读取数据
        len = fis.read(bys);
        System.out.println(len);
//        System.out.println(new String(bys));
        System.out.println(new String(bys, 0 , len));


        //第三次读取数据
        len = fis.read(bys);
        System.out.println(len);
        //String(byte[] bytes, int offset, int length)
        System.out.println(new String(bys, 0 , len));

        //再多读取两次
        len = fis.read(bys);
        System.out.println(len);
        len = fis.read(bys);
        System.out.println(len);
*/


        /*
            Hello\r\n
            world\r\n

            第一次： Hello
            第二次：\r\nwor
            第三次：ld\r\nr
         */

        byte[] bys = new byte[1024]; //1024及其整数倍

        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }

        //释放资源
        fis.close();

    }
}
