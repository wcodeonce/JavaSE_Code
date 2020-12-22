package Demo05;

import java.util.Scanner;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

//需求:键盘录入字符串,统计该字符串中大写字母字
//写字母字符,数字字符出现的次数(不考虑其他字符)

//    思路
//判断字符属于哪种类型,然后对应类型的统计遍历 +1
//假如ch是一个字符,我要判断它属于大写字母,小写字母,还是数字,直接判断该字符在对应的范围内即可
//大写字母: ch >= 'A' && ch <= 'Z'
//大写字母: ch >= 'a' && ch <= 'z'
//数字: ch >= '0' && ch <= '9'


public class sumString {
    public static void main(String[] args) {
        //键盘录入一个字符串,用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串: ");
        String input = sc.nextLine();

        //要统计三种类型的字符个数,需定义三个统计遍历,初始值都为0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历字符串,得到每个字符
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            //判断字符属于哪种类型,然后对应类型的统计遍历 +1
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母: " + bigCount + "个");
        System.out.println("小写字母: " + smallCount + "个");
        System.out.println("数字: " + numberCount + "个");
    }
}
