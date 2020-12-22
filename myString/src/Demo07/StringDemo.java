package Demo07;

import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:
// 定义一个方法,实现字符串反转。键盘录入一个字符串,调用该方法后,在控制台输出结果
// 例如,键盘录入abc,输出结果cba

//思路
    /*
        1.键盘录入一个字符串,用Scanner实现
        2.定义一个方法,实现字符串反转,.返回值类型String, 参数String s
        3.在方法中把字符串倒着遍历,然后把每一个的到的字符拼接成一个字符串返回
        4.调用方法,用一个变量接收
        5.输出结果
    */

public class StringDemo {
    public static void main(String[] args) {
        //1.键盘录入一个字符串,用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();

        //4.调用方法,用一个变量接收
        String s = reverse(line);

        //5.输出结果
        System.out.println("s: " + s);

    }

    //2.定义一个方法,实现字符串反转,.
    //返回值类型String, 参数String s
    public static String reverse(String s) {
        //3.在方法中把字符串倒着遍历,然后把每一个的到的字符拼接成一个字符串返回
        String ss = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }

        return ss;
    }

}
