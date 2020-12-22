package Demo04;

import Demo03.Test01;

import java.security.PublicKey;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//测试类

public class tesk02 {
    public static void main(String[] args) {
        //创建对象
        tesk01 s1 = new tesk01();
        s1.show();

        //public tesk01(String name)
        tesk01 s2 = new tesk01("小明");
        s2.show();

        //public tesk01(int age);
        tesk01 s3 = new tesk01(18);
        s3.show();

        //public tesk01(String name, int age)
        tesk01 s4 = new tesk01("小明", 18);
        s4.show();

    }
}
