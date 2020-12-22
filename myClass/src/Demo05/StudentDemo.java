package Demo05;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class StudentDemo {
    public static void main(String[] args) {

        //使用无参构造方法 创建对象狗使用setXx()方法
        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(18);
        s1.show();

        //使用带参构造方法直接创建带有属性的对象
        Student s2 = new Student("小红", 20);
        s2.show();

    }
}
