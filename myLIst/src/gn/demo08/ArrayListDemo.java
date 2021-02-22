package gn.demo08;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author HTH
 * @Date 2020/12/20
 */

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1.定义学生类
        2.创建ArrayList集合对象
        3.创建学生对象
        4.把学生对象添加到集合
        5.遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */

public class ArrayListDemo {
    public static void main(String[] args) {

        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("大熊", 18);
        Student s2 = new Student("静香", 19);
        Student s3 = new Student("胖虎", 20);

        //把学生对象添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合

        //迭代器：集合特有的遍历方式
        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student st = it.next();
            System.out.println(st.getName() + ", " + st.getAge());
        }
        System.out.println("-----------------------------------");


        //普通for：带有索引的遍历方式
        for (int i = 0; i < array.size(); i++) {
            Student st = array.get(i);
            System.out.println(st.getName() + ", " + st.getAge());
        }
        System.out.println("-----------------------------------");


        //增强for：最方便的遍历方式
        for (Student st : array) {
            System.out.println(st.getName() + ", " + st.getAge());
        }


    }
}
