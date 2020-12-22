package Demo03;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */
/*
    1. StringBuilder 转换为 String
        public String toString( ) : 通过 toString( ) 就可以实现把 StringBuilder 转换为 String
    2.  String 转换为 StringBuilder
        public StringBuilder( String s ) : 通过构造方法就可以实现把 String 转换为 StringBuilder
*/
public class StringBudilderDemo02 {
    public static void main(String[] args) {
        //2.  String 转换为 StringBuilder
        String s = "Hello";

//        StringBuilder sb = s;       //错误做法
        //public StringBuilder( String s ) : 通过构造方法就可以实现把 String 转换为 StringBuilder
        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb);
    }
}
