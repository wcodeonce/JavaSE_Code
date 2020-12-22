package Demo01;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    学生测试类
**/
public class StudenDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成语变量赋值
        s.setName("小明");
        s.setAge(18);

        //调用show方法
        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s.getName() + "~~~" + s.getAge());
    }
}
