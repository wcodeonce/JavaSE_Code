import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class DebugTesk01 {
    public static void main(String[] args) {
        //创建对象
        Scanner input = new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个整数：");
        int a = input.nextInt();

        System.out.println("请输入第二个整数：");
        int b = input.nextInt();

        //调用方法
        int max = getMax(a, b);

        //输出结果
        System.out.println("较大的值是: " + max);
    }
    //获取两个数的较大值
    public static int getMax(int a, int b)
    {
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

}
