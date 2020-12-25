package cn.demo03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    字节缓冲流：
        BufferOutputStream
        BufferInputStream

    构造方法：
        字节缓冲输出流：BufferedOutputStream(OutputStream)
        字节缓冲输入流：BufferedInputStream(InputStream in)
 */

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {

        //字节缓冲输出流：BufferedOutputStream(OutputStream)
//        FileOutputStream fos = new FileOutputStream("myByteStream\\box.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        /*
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\\\box.txt"));

        //写数据
        bos.write("Hello\r\n".getBytes());
        bos.write("World\r\n".getBytes());


        //释放资源
        bos.close();
        */


        //字节缓冲输入流：BufferedInputStream(InputStream in)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myByteStream\\\\box.txt"));

        //一次读取一个字节数据
//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }


        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }

        //释放资源
        bis.close();

    }
}
