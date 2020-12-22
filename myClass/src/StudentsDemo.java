import java.security.PublicKey;

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

public class StudentsDemo {
    public static void main(String[] args) {
        //创建对象
        Students s = new Students();

        //给成员变量赋值
        s.name = "小明";
//        s.age = -18;
//        s.age = 18;

        s.setAge(30);
//        s.setAge(-30);

        //调用show方法
        s.show();
    }
}
