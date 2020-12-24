package an.demo01;

import java.io.File;
import java.io.IOException;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    File 类删除功能
        public boolean delete ( )删除由此抽象路径名表示的文件或目录
 */

public class FileDemo03 {
    public static void main(String[] args) throws IOException {

//        File f1 = new File("D:\\FileDemo\\java.txt");
        //需求1：在当前模块目录下创建Java.txt文件
        File f1 = new File("myFile\\java.txt");
//        System.out.println(f1.createNewFile());

        //需求2：删除当前目录下的Java.txt文件
        System.out.println(f1.delete());
        System.out.println("--------------");


        //需求3：在当前模块目录下创建 Demo 目录
        File f2 = new File("myFile\\Demo");
//        System.out.println(f2.mkdir());

        //需求4：删除当前目录下的 Demo 目录
        System.out.println(f2.delete());

        System.out.println("--------------");


        //需求5：在当前模块下创建一个目录 Demo ，然后在该目录下创建一个文件Java.txt
        File f3 = new File("myFile\\Demo");
//        System.out.println(f3.mkdir());
        File f4 = new File("myFile\\Demo\\Java.txt");
//        System.out.println(f4.createNewFile());

        //需求6：删除当前模块下的目录 Demo
        //删除目录时，目录下有文件要先删除目录下的文件，在删除目录
        System.out.println(f4.delete());
        System.out.println(f3.delete());

    }
}
