package an.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    需求:
        ArrayList存储学生对象,使用Collections对ArrayList进行排序
        要求: 按照年龄从小到大排序, 年龄相同时, 按照姓名的字母顺序

    思路:
        1.定义学生类
        2.创建Arraylist集合对象
        3.创建学生对象
        4.把学生对象添加到集合
        5.使用Collections对ArrayList集合排序
        6.遍历集合
 */

public class CollectionsDemo02 {
    public static void main(String[] args) {

        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("大雄", 18);
        Student s2 = new Student("静香", 19);
        Student s3 = new Student("胖虎", 20);
        Student s4 = new Student("小夫", 20);

        //把学生类添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //使用Collections对ArrayList集合排序
        //sort(list<T>) list, Comparator<? super T> C)
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                //按照年龄从小到大排序
                int num = s1.getAge() - s2.getAge();

                //年龄相同时, 按照姓名的字母顺序
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //遍历集合
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
