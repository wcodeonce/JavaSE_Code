package an.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    File 类创建功能
        | 方法名                            | 说明                                                         |
        | -------------------------------- | ------------------------------------------------------------ |
        | public boolean createNewFile ( ) | 当具有该名称的文件不存在时，创建一个有该抽象路径命名的新空文件 |
            如果文件不存在就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        | public boolean mkdir ( )         | 创建由此抽象路径命名的目录                                   |
            如果目录不存在就创建目录，并返回true
            如果目录存在，就不创建目录，并返回false

        | public boolean mkdirs ( )        | 创建由此抽象路径命名的目录，包括任何必须但不存在的父目录（多级目录） |
            如果多级目录不存在就创建多级目录，并返回true
            如果多级目录存在，就不创建多级目录，并返回false
 */

public class FileDemo02 {
    public static void main(String[] args) throws IOException {

        //需求1：我要在 D:\\FileDemo 目录下创建一个文件 Java.txt
        File f1 = new File("D:\\FileDemo\\Java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------------------------");


        //需求2：我要在 D:\\FileDemo 目录下创建一个目录 JavaSE
        File f2 = new File("D:\\FileDemo\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("----------------------------");


        //需求3：我要在 D:\\FileDemo 目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\FileDemo\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs());
        System.out.println("----------------------------");


        //需求4：我要在 D:\\FileDemo 目录下创建一个文件 JavaSE.txt
        File f4 = new File("D:\\FileDemo\\JavaSE.txt");
        //不能根据路径名判断是否是创建文件，要根据调用的方法
//        System.out.println(f4.mkdir());
        System.out.println(f4.createNewFile());

    }
}
