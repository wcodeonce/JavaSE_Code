package dn.demo04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author WTIHK
 * @Date 2020/12/30
 */

/*
    Properties 和 IO 流结合的方法：
        void load(InputStream inStream)
            从输入字节流读取属性列表（键和元素对）

        void store(OutputStream out, String comments)
            将此属性列表（将和元素对）写入此Properties 表中，以适合于使用 load(InputStream) 方法的格式写入输出字节流

 */

public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException{

        //把集合中的数据保存到文件
        myStore();


        //把文件中的数据加载到集合
        myLoad();


    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        //void load(InputStream inStream)
        FileReader fr = new FileReader("myOtherStream\\fw.txt");

        prop.load(fr);

        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("Hk123", "大雄");
        prop.setProperty("Hk125", "静香");
        prop.setProperty("Hk127", "胖虎");

        //void store(OutputStream out, String comments)
        FileWriter fw = new FileWriter("myOtherStream\\fw.txt");

        prop.store(fw, null);

        fw.close();
    }
}
