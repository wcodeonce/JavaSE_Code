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
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1. StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");

//        String s = sb;      //错误做法
        //public String toString( ) : 通过 toString( ) 就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);

    }
}
