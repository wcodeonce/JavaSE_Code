/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class definition {
    public static void main(String[] args) {
        //调用方法
        int result = one(10, 20);
        System.out.println(result);

        double result2 = one(10.0, 20.0);
        System.out.println(result2);

        int result3 = one(10, 20, 30);
        System.out.println(result3);

    }

    //方法重载值同一个类中定义的多个方法之间的关系, 满足条件的多个方法相互构成重载

    public static int one(int a, int b)
    {
        return a + b;
    }

    public static double one(double a, double b)
    {
        return a + b;
    }

    public static int one(int a, int b, int c)
    {
        return a + b + c;
    }


}
