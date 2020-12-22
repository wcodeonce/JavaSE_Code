package Demo05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    需求：
        创建一个存储学生对象的集合,存储3个学生对象,
        使用程序实现在控制台遍历该集合学生的姓名和年龄来自于键盘录
*/
    /*
        思路：
            1. 定义学生类， 为了键盘录入数据方便， 把学生类中的成员变量都定义为String类型
            2. 创建集合对象
            3. 键盘录入学生对象所需要的数据
            4. 创建学生对象， 把军民录入的数据赋值给学生对象的成员变量
            5. 往集合中添加学生对象
            6. 遍历集合， 采用通用遍历格式实现
    */

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //2. 创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
/*
        //3. 键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名： ");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄： ");
        int age = sc.nextInt();

        //4. 创建学生对象， 把军民录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //5. 往集合中添加学生对象
        array.add(s);
 */

        //提高代码复用性，用方法改进程序
        //调用方法
        addStudent(array);
        addStudent(array);
        addStudent(array);

        //6. 遍历集合， 采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }

    //提高代码复用性，用方法改进程序
    /*
        两个明确：
            返回值类型：void
            参数： ArrayList<Student> array
    */
    public static void addStudent(ArrayList<Student> array) {
        //3. 键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名： ");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄： ");
        int age = sc.nextInt();

        //4. 创建学生对象， 把军民录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //5. 往集合中添加学生对象
        array.add(s);
    }
}























