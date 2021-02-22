package cn.demo03;

import java.util.ArrayList;

/**
 * @Author WTIHK
 * @Date 2021/2/23
 */

/*
    Stream<T>limit(long maxSize)：返回此流中的元素组成的流，截取前指定参数个数的数据
    Stream<T>skip(long n)l：跳过指定参数个数的数据，返回由该流的剩余元素组成的流
 */

public class StreamDemo02 {
    public static void main(String[] args) {

        //创建一个集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("大雄");
        list.add("小静香");
        list.add("胖虎");
        list.add("小夫");
        list.add("哆啦A梦");

        //需求1:取前3个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);

        System.out.println("-------------------");


        //需求2:跳过3个元素,把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);

        System.out.println("-------------------");


        //需求3:跳过2个元素,把剩余的元素中前2个在控制台输出
        list.stream().skip(3).limit(2).forEach(System.out::println);

    }
}
