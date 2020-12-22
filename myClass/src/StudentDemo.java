/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
* 学生测试类
* */

public class StudentDemo {
    public static void main(String[] args) {

        //创建对象
        Student s = new Student();

        System.out.println(s);

        //使用成员变量
        System.out.println(s.name + "," + s.age);

        s.name = "小明";
        s.age = 18;

        System.out.println(s.name + "," + s.age);

        //调用成员方法
        s.study();
        s.doHomework();

        Student s2 = new Student();
        s2.name = "小红";
        s2.age = 10;
        s2.study();
        s2.doHomework();
        System.out.println(s2.name + "," + s2.age);

        Student s3 = s2;
        s3.name = "小白";
        s3.age = 20;
//        s3.study();
//        s3.doHomework();
        System.out.println(s2.name + "," + s2.age);
        System.out.println(s3.name + "," + s3.age);

    }
}
