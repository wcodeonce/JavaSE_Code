package dn.demo04;

import java.util.Arrays;

/**
 * @Author HTH
 * @Date 2020/12/8
 */

/*
    需求:
        有一个字符串: "91 27 46 38 50", 倾斜程序实现最终输出结果是: "27 38 46 50 91"
 */
/*
    思路:
        1.定义一个字符串
        2.吧字符串中的数字数据存储到一个int类型的数组中
            # 得到字符串中每一个数字数据
            public String[] split(String regex)
            # 定义一个 int 数组,把String[]数组中的每一个元素存储到 int 数组中
            public static int parseInt(String s)
        3.对 int 数组进行排序
        4.把排序后的int数组中的元素进行拼接得到一个字符串,这里拼接采用StringBuilder来实现
        5.输出拼接的结果
 */
public class IntegerTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "91 27 46 38 50";

        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }

        //把字符串中的数字数据存储到一个int类型的数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //对int数组进行排序
        Arrays.sort(arr);

        //把排序后的int数组中的元素进行拼接得到一个字符串,这里拼接采用StringBuilder来实现
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();

        //输出拼接的结果
        System.out.println("result: "+result);

    }
}
