package Demo04;

import java.util.ArrayList;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    需求:
        创建一个存储学生对像的合集, 存储3个学生对象, 使用程序实现在控制台遍历改集合
*/
    /*
        思路:
            1. 定义学生类
            2. 创建集合对象
            3. 创建学生对象
            4. 添加学生对象到集合中
            5. 遍历合集, 采用通用遍历格式实现
    */

public class ArrayListDemo {
    public static void main(String[] args) {
        //2. 创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //3. 创建学生对象
        Student s1 = new Student("小明", 20);
        Student s2 = new Student("小红", 18);
        Student s3 = new Student("小绿", 16);

        //4. 添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //5. 遍历合集, 采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
