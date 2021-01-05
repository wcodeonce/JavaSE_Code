package cn.demo03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Author WTIHK
 * @Date 2020/12/30
 */

/*
    对象序列化流:
        构造方法：
            ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream

        序列化对象的方法：
            void writeObject(Object obj)：将指定的对象写入ObjectOutputStream

    NotSerializableException:当实例需要具有Serializable接口时抛出。 序列化运行时或实例的类可以抛出此异常。

    类的序列化由实现java.io.Serializable接口的类启用。 不实现此接口的类将不会使任何状态序列化或反序列化。
 */

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        //ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));


        //创建对象
        Student s = new Student("大雄", 18);


        //void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        oos.writeObject(s);


        //释放资源
        oos.close();

    }
}
