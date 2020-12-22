package en.demo05;

import java.util.TreeSet;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    - 存储学生对象并遍历，创建 `TreeSet` 集合使用 无参构造方法
    - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */

public class TreeSetDemo02 {
    public static void main(String[] args) {

        //创建集合对象
        TreeSet<Student> st = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("大熊", 18);
        Student s2 = new Student("静香", 19);
        Student s3 = new Student("胖虎", 20);
        Student s4 = new Student("小夫", 21);

        Student s5 = new Student("哆啦A梦", 18);
        Student s6 = new Student("哆啦A梦", 18);

        //添加学生对象到集合
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);

        st.add(s5);

        //遍历集合对象
        for (Student s : st) {
            System.out.println(s.getName() + "," + s.getAge());
        }
        //ClassCastException

    }
}
