package Demo02;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//        - 基本类型: 比较的是 **数据值** 是否相同
//        - 引用类型: 比较的是 **地址值** 是否相同

public class StringDemo01 {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("-----------------");

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));

    }
}
