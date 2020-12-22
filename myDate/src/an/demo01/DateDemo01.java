package an.demo01;

import java.util.Date;

/**
 * @Author HTH
 * @Date 2020/12/8
 */

/*
    public Date ( )分配一个Date对象,并初始化,以便代表它分配的时间，精确到毫秒
    public Date (long date)分配一个Date对象，并将其初始化，并将其初始化为表示从标准基准时间起指定的毫秒数
 */

public class DateDemo01 {
    public static void main(String[] args) {
        //public Date ( )分配一个Date对象,并初始化,以便代表它分配的时间，精确到毫秒
        Date d1 = new Date();
        System.out.println(d1);

        //public Date (long date)分配一个Date对象，并将其初始化，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);

    }
}
