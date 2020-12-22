import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串数据： ");
        //String line = sc.nextLine();
        String line = sc.next();


        //输出结果
        System.out.println("你输入的数据是： " + line);
    }
}
