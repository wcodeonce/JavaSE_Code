package bn.demo02;

/**
 * @Author HTH
 * @Date 2020/12/20
 */

/*
    哈希值：是JDK根据对象的 地址 或者 字符串 或者 数字 算出来的`int`类型的 数值
        Object 类中中有一个方法可以获取 对象的哈希值
        public int hasCode ( ) : 返回对象的哈希值
 */

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("大熊", 18);

        //同一个对象多次调用HashCode()方法返回的哈希值是相同的
        System.out.println(s1.hashCode());//1060830840
        System.out.println(s1.hashCode());//1060830840
        System.out.println("------------------------------");

        Student s2 = new Student("静香", 19);

        //默认情况下，不同对象的哈希值是不相同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());//2137211482

        System.out.println("------------------------------");

        System.out.println("Hello".hashCode()); //69609650
        System.out.println("World".hashCode()); //83766130
        System.out.println("JavaSE".hashCode());//-2083217388

        System.out.println("World".hashCode()); //83766130
        System.out.println("------------------------------");

        System.out.println("你好".hashCode());//652829
        System.out.println("世界".hashCode());//649718

    }
}
