package fn.demo06;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    需求:
        用TreeSet集合存储多个学生信息(姓名,语文成绩,数学成绩),并遍历该集合
        要求:按照总分从高到低出现

    思路:
        1.定义学生类
        2.创建TreeSet集合对象,通过比较器排序进行排序
        3.创建学生对象
        4.把学生对象添加到集合
        5.遍历集合
 */

public class TreeSetDemo {
    public static void main(String[] args) {

        //创建TreeSet集合对象,通过比较器排序进行排序
        TreeSet<Student> st = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("大熊", 88, 90);
        Student s2 = new Student("静香", 95, 94);
        Student s3 = new Student("小夫", 80, 85);
        Student s4 = new Student("胖虎", 78, 60);
        Student s5 = new Student("老王", 88, 99);

        Student s6 = new Student("张三", 99, 88);
//        Student s7 = new Student("张三", 99, 88);
        Student s7 = new Student("李四", 99, 88);


        //把学生对象添加到集合
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);

        //遍历集合(增强for)
        for (Student s : st) {
            System.out.println(s.getName() + ":语文" + s.getChinese() + ",数学" + s.getMath() + ",总分:" + s.getSum());
        }
    }
}
