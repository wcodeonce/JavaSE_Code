package cn.demo03;

import java.io.*;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    需求：
        把 D:\\FileDemo\\Python 的安装.mp4 复制到模块目录下的 Python 的安装.mp4

    思路：
        1.根据数据源创建字节输入流对象
        2.根据目的地创建字节输出流对象
        3.读写数据，复制视频（一次读取一个数组，一次写入一个字节数组）
        4.释放资源

    四种方式实现复制视频，并记录每种方式复制视频的时间
        1.基本字节流一次读写一个字节             共耗时:404137毫秒
        2.基本字节流一次读写一个字节数组          共耗时:684毫秒
        3.字节缓冲流一次读写一个字节             共耗时:1038毫秒
        4.字节缓冲流一次读写一个字节数组          共耗时:1091毫秒
 */

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {

        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
//        method1();//基本字节读写         --共耗时:404137毫秒
//        method2();//基本字节数组         --共耗时:684毫秒
//        method3();//字节缓冲流字节读写    --共耗时:1038毫秒
//        method4();//字节缓冲流字节数组读写 --共耗时:1091毫秒



        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时:" + (endTime - startTime) + "毫秒");

    }

    //基本字节流一次读写一个字节
    public static void method1() throws IOException {
        //D:\\FileDemo\\Python 的安装.mp4
        //模块目录下的 Python 的安装.mp4
        FileInputStream fis = new FileInputStream("D:\\FileDemo\\Python 的安装.mp4");
        FileOutputStream fos = new FileOutputStream("myByteStream\\Python 的安装.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }


    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        //D:\\FileDemo\\Python 的安装.mp4
        //模块目录下的 Python 的安装.mp4
        FileInputStream fis = new FileInputStream("D:\\FileDemo\\Python 的安装.mp4");
        FileOutputStream fos = new FileOutputStream("myByteStream\\Python 的安装.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }


    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\FileDemo\\Python 的安装.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\Python 的安装.mp4"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }


    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\FileDemo\\Python 的安装.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\Python 的安装.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }

}
