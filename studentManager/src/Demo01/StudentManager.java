package Demo01;

import java.util.ArrayList;
import java.util.Scanner;

/*
    学生管理系统：
        1. 定义学生类
        2. 主界面的代码编写
        3. 添加学生的代码编写
        4. 查看学生的代码编写
        5. 删除学生的代码编写
        6. 修改学生的代码编写
*/
/*
    主界面的代码编写:
        思路:
        1. 用输出语句完成主界面的编写
        2. 用Scanner实现键盘录入数据
        3. 用switch语句完成操作的选择
        4. 用循环完成在职回到主界面
*/
/*
    添加学生的代码编写
        思路
        1. 用键盘录入选择添加的学生
        2. 定义一个方法, 用于添加学生
            1) 显示提示信息,提示要输入何种信息
            2) 键盘录入学生对象所需要的数据
            3) 创建学生对象,把键盘录入的数据赋值给学生对象的成员变量中
            4) 将学生对象添加到和集中(保存)
            5) 给出添加成功提示
        3. 调用方法
*/
/*
    查看学生的代码编写
        思路:
        1. 用键盘录入选择查看所有学生信息
        2. 定义一个方法,用于查看学生信息
            1) 判断合集中是否由数据,如果没有显示提示信息
            2) 显示表头信息
            3) 将合集中数据去除按照对应格式显示学生信息,年龄显示补充 "岁"
        3. 调用方法
*/
/*
    删除学生的代码编写
        思路:
        1. 用键盘录入选择删除学生信息
        2. 定义一个方法, 用于删除学生信息
            1) 显示提示信息
            2) 键盘录入要删除的学生学号
            3) 遍历合集将对应学生对象从合集中删除
            4) 给出删除成功提示
        3. 调用方法
*/
/*
    修改学生的代码编写
        思路:
        1. 用键盘录入选择修改学生信息
        2. 定义一个方法, 用于修改学生信息
            1) 显示提示信息
            2) 键盘录入要修改的学生学号
            3) 键盘录入要修改的学生信息
            4) 遍历集合修改对象的学生信息
            5) 给出修改成功提示
        3. 调用方法
*/
/*
    解决删除/修改学生学号不存在问题
    思路:
    1. 在删除/修改学生操作前,对学号是否存在进行判断
        1) 如果不存在, 显示提示信息
        2) 如果存在, 执行删除/修改信息
*/
/*
    解决添加学生学号重复问题
        思路:
        1. 定义一个方法,对学号是否被使用进行判断
            如果与集合中的某一个学生学号相同,返回true
            如果都不相同,返回false
        2. 在添加学生录入学号后调用该方法
            1) 如果返回true,弹出提示,重新输入学号
            2) 如果返回false,正常添加学生对象
*/
public class StudentManager {

    public static void main(String[] args) {

        //创建集合对象,用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();

        //4. 用循环完成在职回到主界面
        while (true) {

            //1. 用输出语句完成主界面的编写
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择: ");

            //2. 用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //3. 用switch语句完成操作的选择
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
//                    break;
                    System.exit(0);  //JVM退出
                default:
                    System.out.println("输入错误!");
                    break;

            }
        }


    }

    //定义一个方法,用于添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        // 显示提示信息,提示要输入何种信息
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外面被访问到,我们把它定义在了循环外面
        String sid;

        //为了让程序回到这里,我们用循环实现
        while (true) {
            System.out.println("请输入学生学号: ");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用,请重新输入!");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();
        System.out.println("请输入学生地址: ");
        String address = sc.nextLine();

        // 创建学生对象,把键盘录入的数据赋值给学生对象的成员变量中
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        // 将学生对象添加到和集中(保存)
        array.add(s);

        // 给出添加成功提示
        System.out.println("添加学生成功!");

    }

    //定义一个方法,对学号是否被使用进行判断
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        //如果与集合中的某一个学生学号相同,返回true, 如果都不相同,返回false
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    //定义一个方法,用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        //判断合集中是否由数据,如果没有显示提示信息
        if (array.size() == 0) {
            System.out.println("无信息,请先添加信息在查询!");
            //为了让程序不再往下执行,给出return;
            return;
        }

        //显示表头信息
        //\t其实就是tab键的位置
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        //将合集中数据去除按照对应格式显示学生信息,年龄显示补充 "岁"
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    //定义一个方法, 用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        //键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号: ");
        String sid = sc.nextLine();

        //在删除/修改学生操作前,对学号是否存在进行判断
        // 如果不存在, 显示提示信息
        // 如果存在, 执行删除/修改信息
        //遍历合集将对应学生对象从合集中删除
        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
//                int index = i;
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在,请重新输入!");
        } else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功!");
        }
    }

    //定义一个方法, 用于修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        // 显示提示信息
        Scanner sc = new Scanner(System.in);

        // 键盘录入要修改的学生学号
        System.out.println("请输入你要修改的学生的学号: ");
        String sid = sc.nextLine();

        int index = -1;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(i)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入！");
        }else {

            // 键盘录入要修改的学生信息
            System.out.println("请输入学生新姓名: ");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄: ");
            String age = sc.nextLine();
            System.out.println("请输入学生新居住地: ");
            String address = sc.nextLine();

            // 创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);

            // 遍历集合修改对象的学生信息
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    array.set(i, s);
                    break;
                }
            }
            // 给出修改成功提示
            System.out.println("修改学生成功!");
        }
    }
}
