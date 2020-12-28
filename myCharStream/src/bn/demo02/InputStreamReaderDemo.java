package bn.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author WTIHK
 * @Date 2020/12/27
 */

/*
    构造方法：
        InputStreamReader (InputStream in): 创建一个使用默认自身集的InputStreamReader

    读数据的两种方式：
        int read(): 一次读一个字符数据
        int read(char[] cbuf): 一次读一个字符数组数据
 */

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {

        //InputStreamReader (InputStream in): 创建一个使用默认自身集的InputStreamReader
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\ConversionStreamDemo.java"));

        //int read(): 一次读一个字符数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }



        //int read(char[] cbuf): 一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }


        //释放资源
        isr.close();
    }
}
