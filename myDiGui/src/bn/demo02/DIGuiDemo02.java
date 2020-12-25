package bn.demo02;

import java.io.File;

/**
 * @Author WTIHK
 * @Date 2020/12/25
 */

/*
    需求：
        给定一个路径（D:\\FileDemo）通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台上

    思路：
        1.根据给定的路径创建一个File对象
        2.定义一个方法，用于获取给定目录下的所有内容，参数作为第一步创建的File对象
        3.获取给定的File目录下所有的文件或者目录的File数组
        4.遍历该File数组，得到每一个File对象
        5.判断该File对象是否是目录
            是：递归调用
            不是：获取绝对路径输出在控制台
        6.调用方法
 */

public class DIGuiDemo02 {
    public static void main(String[] args) {
        //根据给定的路径创建一个File对象
        File srcFile = new File("D:\\FileDemo");
//        File srcFile = new File("myFile");

        //调用方法
        getALLFilePath(srcFile);

    }

    //定义一个方法，用于获取给定目录下的所有内容，参数作为第一步创建的File对象
    public static void getALLFilePath(File srcFile) {
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if (fileArray != null) {
            for (File file : fileArray) {
                //判断该File对象是否是目录
                if (file.isDirectory()) {
                    //是：递归调用
                    getALLFilePath(file);
                } else {
                    //不是：获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

}
