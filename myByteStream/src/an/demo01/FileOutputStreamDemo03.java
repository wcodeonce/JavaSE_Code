package an.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    字节流写数据的两个小问题：
        1.字节流写数据如何实现换行呢？
            不同操作系统对换行符识别不一样
            windows: \r \n
            linux: \n
            mac: \r

        2.字节流写数据如何实现追加写入呢？
            public FileOutputStream(String name,boolean append)
                 创建文件输出流以写入具有指定名称的文件。
                 如果第二个参数是true ，则字节将写入文件的末尾而不是开头
 */

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt", true);


        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write("Hello".getBytes());
            //使用 \r \n 换行符实现换行
            fos.write("\r\n".getBytes());
        }


        //释放资源
        fos.close();

    }
}
