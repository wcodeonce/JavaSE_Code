package an.demo01;

import java.io.File;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    File：它是文件和目录路径名的抽象表示
        - 文件和目录是可以通过 `File` 封装成对象的
        - 对于 `File` 而言，其封装的并不是一个正真的文件，仅仅是一个路径名而已。它可以是存在的，也可以是不存在的。
        将来是要通过具体的操作把这个路径的内容转换为具体存在的

    | 方法名                                | 说明                                                       |
    | ------------------------------------ | ---------------------------------------------------------- |
    | File ( String pathname )             | 通过将给定的路径名字转换为抽象路径名来创建新的 `File` 实例 |
    | File ( String parent, String child ) | 从父路径名字符串和子路径名字符串创建新的 `File` 实例       |
    | File ( File parent, String child )   | 从父抽象路径名和子路径名字符串创建新的 `File` 实例        |
 */

public class FileDemo01 {
    public static void main(String[] args) {

        //File ( String pathname )通过将给定的路径名字转换为抽象路径名来创建新的 `File` 实例
        File f1 = new File("D:\\MyIoFile\\java.txt");
        System.out.println(f1);


        //File ( String parent, String child )从父路径名字符串和子路径名字符串创建新的 `File` 实例
        File f2 = new File("D:\\MyIoFile", "java.txt");
        System.out.println(f2);


        //File ( File parent, String child )   | 从父抽象路径名和子路径名字符串创建新的 `File` 实例
        File f3 = new File("D:\\MyIoFile");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);

    }
}
