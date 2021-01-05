package cn.demo03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author WTIHK
 * @Date 2020/12/30
 */

/*
    构造方法：
        ObjectInputStream(InputStream in) ：创建从指定的 InputStream 读取的 ObjectInputStream

    反序列化对象的方法：
    Object readObject()：从 ObjectInputStream 读取一个对象
 */

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //ObjectInputStream(InputStream in) ：创建从指定的 InputStream 读取的 ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));


        //Object readObject()：从 ObjectInputStream 读取一个对象
        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName() + s.getAge());

        //释放资源
        ois.close();

    }
}
