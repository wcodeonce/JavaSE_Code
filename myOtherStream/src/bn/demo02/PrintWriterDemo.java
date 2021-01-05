package bn.demo02;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author WTIHK
 * @Date 2020/12/29
 */

/*
    字符打印流PrintWriter的构造方法：

      PrintWriter(String fileName)使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新

      PrintWriter(Writer out, boolean autoFlush)创建一个新的PrintWriter
      out：字符输出流
      autoFlush：一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区

 */

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        //PrintWriter(String fileName)使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
        PrintWriter pw = new PrintWriter("myOtherStream\\pw.txt");

        


    }
}
