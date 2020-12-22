package en.demo05;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    学生类
 */

public class Student implements Comparable<Student>{
    //学生类实现Comparable接口
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        //重写compareTo方法
//        return 0; 只输出了一个对象
//        return 1; 顺序输出
//        return -1;倒序输出

        //按照年龄从小到大排序
        int num = this.age - s.age;
//        int num = s.age - this.age;
        //年龄相同时，按照姓名的字母顺序排序
        int num2 = (num == 0 ? this.name.compareTo(s.name) : num );
        return num2;
    }
}
