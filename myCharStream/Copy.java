package bn.demo02;

import java.io.*;

/**
 * @Author WTIHK
 * @Date 2020/12/27
 */

/*
      InputStreamReader是从字节流到字符流的桥接器：
      它使用指定的charset读取字节并将其解码为字符。
      它使用的字符集可以通过名称指定，也可以明确指定，或者可以接受平台的默认字符集。

      OutputStreamWriter是从字符流到字节流的桥接器：
      使用指定的charset写入其中的字符编码为字节。
      它使用的字符集可以通过名称指定，也可以明确指定，或者可以接受平台的默认字符集。
 */

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {

        //OutputStreamWriter(OutputStream out) 创建使用默认字符编码的OutputStreamWriter。
        //OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定charset的OutputStreamWriter。

//        FileOutputStream fos = new FileOutputStream("myCharStream\\osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"), "GBK");

        osw.write("中国");
        osw.close();


        //InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
        //InputStreamReader(InputStream in, String charsetName) 创建一个使用指定charset的InputStreamReader。

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"), "GBK");

        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        isr.close();

    }
}
