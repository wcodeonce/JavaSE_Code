package Demo05;

import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */
/*
    需求:
        定义—个方法,实现字符串反转。键盘录入一个字符串,调用该方法后,在控空制台输出结
        例如,键盘录入abC,输出结果cba
*/
    /*
        思路:
            1. 键盘录入一个字符串
            2. 定义一个方法,实现字符串反转.返回值类型 String, 参数 String s
            3. 在方法中用 StringBuilder 实现字符串的反转, 并把结果转成 String 返回
            4. 调用方法,用以一个变量接收结果
            5. 输出结果
    */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        //1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();

        //4. 调用方法,用以一个变量接收结果
        String s = myReverse(line);

        //5. 输出结果
        System.out.println("s: " + s);


    }
    //2. 定义一个方法,实现字符串反转.返回值类型 String, 参数 String s
    public static String myReverse(String s){
        //3. 在方法中用 StringBuilder 实现字符串的反转, 并把结果转成 String 返回
/*        StringBuilder sb = new StringBuilder();
        sb.reverse();
        String ss = sb.toString();
        return ss;*/

        //链式编程
        return new StringBuilder(s).reverse().toString();
    }
}
