package Demo02;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    StringBuilder 的添加和反转方法
        public StringBuilder append( 任意类型 )添加数据，并返回对象本身
        public StringBuilder reverse( )返回相反的字符序列
 */

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

        //public StringBuilder append( 任意类型 )添加数据，并返回对象本身
//        StringBuilder sb2 = sb.append("Hello");
//
//        System.out.println("sb: " + sb);
//        System.out.println("sb2: "+ sb2);
//        System.out.println(sb == sb2);

//        sb.append("Hello");
//        sb.append("World");
//        sb.append("Java");
//        sb.append(100);

        //链式编程
        sb.append("Hello").append("World").append("Java").append(100);

        System.out.println("sb: "+ sb);

        //public StringBuilder reverse( )返回相反的字符序列
        sb.reverse();
        System.out.println("sb: " + sb);
    }
}
