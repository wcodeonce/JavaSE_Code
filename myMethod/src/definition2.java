/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class definition2 {
    public static void main(String[] args) {

        //需求:使用方法重载的思想,
        // 设计比较两个整数是否相同的方法,兼容全整数类型( byte, short, int, long)

        //调用方法
        System.out.println(compare(10, 20));
        System.out.println(compare((byte)10, (byte)20));
        System.out.println(compare((short)10, (short)20));
        System.out.println(compare(10L, 20L));

    }

    //int
    public static boolean compare(int a, int b)
    {
        System.out.println("int");
        return a == b;
    }

    //long
    public static boolean compare(long a, long b)
    {
        System.out.println("long");
        return a == b;
    }

    //byte
    public static boolean compare(byte a, byte b)
    {
        System.out.println("byte");
        return a == b;
    }

    //short
    public static boolean compare(short a, short b)
    {
        System.out.println("short");
        return a == b;
    }


}
