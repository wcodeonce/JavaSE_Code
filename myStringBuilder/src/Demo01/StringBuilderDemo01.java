package Demo01;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    StringBuilder构造信息
        public StringBuilder()创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder( String str )根据字符串的内容，来创建可变字符串对象
*/

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //public StringBuilder()创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb);
        System.out.println("sb.length():" + sb.length());

        //public StringBuilder( String str )根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2: " + sb2);
        System.out.println("sb2.length(): " + sb2.length());
    }
}
