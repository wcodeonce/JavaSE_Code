package an.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HTH
 * @Date 2020/12/8
 */

/*
    #### SimpleDateFormat 的构造方法

| 方法名                                      | 说明                                                     |
| ------------------------------------------ | -------------------------------------------------------- |
| public SimpleDateFormat ( )                | 构造一个SimpleDateFormat，使用默认模式和日期格式         |
| public SimpleDateFormat ( String pattern ) | 构造一个SimpleDateFormat，使用给定的模式和默认的日期格式 |

#### SimpleDateFormat 格式化和解析日期

##### 1.格式化（从 Date 到 String）
public final String **format (Date date)** : 将日期格式化成日期/时间字符串
##### 2.解析（从 String 到 Date）
public Date **parse (String source)** : 从给定字符串的开始解析文本以生成日期
 */

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 1.格式化（从 Date 到 String）
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        System.out.println("----------------------------------------");

        // 2.解析（从 String 到 Date）
        String ss = "2020-12-08 12:12:12";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}
