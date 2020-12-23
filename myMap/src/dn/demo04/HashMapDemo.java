package dn.demo04;

import java.util.HashMap;
import java.util.Set;

/**
 * @Author WTIHK
 * @Date 2020/12/23
 */

/*
    需求：
        创建一个HashMap集合，监视学生对象(Student),值是居住地(String).存储多个键值对元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量相同，我们就认为是同一个对象

    思路：
        1.定义学生类
        2.创建HashMap集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合
        6.在学生类中重写两个方法
            hashCode()
            equals()
 */

public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> map = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("大熊", 18);
        Student s2 = new Student("静香", 19);
        Student s3 = new Student("胖虎", 20);

        Student s4 = new Student("胖虎", 20);
//        Student s3 = new Student("胖虎", 20);

        //把学生添加到集合
        map.put(s1, "广东");
        map.put(s2, "上海");
        map.put(s3, "深圳");

        map.put(s4, "北京");

        //遍历数组
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }

    }
}
