package an.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    FileOutputStream：文件输出流用于将数据写入 `File`
        `FileOutputStream ( String name ) `: 创建文件输出流以指定的名称写入文件
 */

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream ( String name ): 创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");

        /*
            做了三件事情：
                1.调用系统功能创建了文件
                2.创建了字节输出流对象
                3.让字节输出流对象指向创建好的文件
         */

        //void write (int b): 将指定的字节写入此文件输出流
        fos.write(97);
//        fos.write(57);
//        fos.write(55);


        //所有和IO相关的内容，最后都有释放资源
        //void close (): 关闭此文件输出流并释放于此流相关联的任何系统资源
        fos.close();

        /*
            close做了两件事情：
                1.关闭此输出流
                2.释放于此流相关联的任何系统资源
         */

    }
}
