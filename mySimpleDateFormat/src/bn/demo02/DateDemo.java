package bn.demo02;

import java.text.ParseException;
import java.util.Date;

/**
 * @Author HTH
 * @Date 2020/12/8
 */

/*
    需求:
        定义一个日期工具类(DateUtils),包含两个方法:
            1.把日期转换为指定格式的字符串;
            2.把字符串解析为指定格式的日期
        然后定义一个测试类(DateDemo),测试日期工具类的方法
 */
/*
    思路:
        1. 定义日期工具类(DateUtils)
        2. 定义一个方法dateToString,方法,用于把日期转换为指定格式的字符串
            返回值类型: String
            参数: Date date, String format
        3. 定义一个方法stringToDate, 用于字符串解析为指定格式的日期
            返回值类型: Date
            参数: String s, String format
        4. 定义测试类DateDemo, 调用日期工具类中的方法
 */

    /*
        测试类
     */

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        System.out.println("---------------------------");

        String s = "2020-12-08 12:12:12";
        Date dd = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);


    }
}
