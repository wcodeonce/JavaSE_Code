package en.demo06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author WTIHK
 * @Date 2020/12/28
 */

/*
    需求：
        把ArrayList集合中的学生的数据写入到文本文件。
        要求：每一个学生对象的数据作为文件中的一行数据
        格式：
            学生：学号, 姓名, 年龄, 居住地
        举例：
            Hk123, 大雄, 18, 北京

    思路：
        1.定义学生类
        2.创建ArrayList集合
        3.创建学生对象
        4.把学生对象添加到集合中
        5.创建字符缓冲输出流对象
        6.遍历集合，得到每一个学生对象
        7.把学生对象的数据拼接成指定格式的字符串
        8.调用字符缓冲输出流对象对象的方法写数据
        9.释放资源
 */

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {

        //创建ArrayList集合
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("Hk123", "大雄", 18, "北京");
        Student s2 = new Student("Hk125", "静香", 19, "上海");
        Student s3 = new Student("Hk127", "胖虎", 20, "广东");


        //把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);


        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\students.txt"));


        //遍历集合，得到每一个学生对象
        for (Student s : array) {
            //把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            //调用字符缓冲输出流对象对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
