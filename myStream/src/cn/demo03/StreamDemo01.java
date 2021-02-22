package cn.demo03;

import java.util.ArrayList;

/**
 * @Author WTIHK
 * @Date 2021/2/23
 */

/*
    Stream<T> filter(Predicate predicate)：用于对刘中的数据进行过滤
    Predicate接口中的方法				boolean test(T t)：对给定的参数进行判断，返回一个布尔值
 */

public class StreamDemo01 {
    public static void main(String[] args) {

        //创建一个集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("大雄");
        list.add("小静香");
        list.add("胖虎");
        list.add("小夫");
        list.add("哆啦A梦");

        //需求1:把List集合中以'小'开头的元素在控制台输出
//        list.stream().filter((String s) -> {
//            return s.startsWith("小");
//        }).forEach(System.out::println);

        list.stream().filter(s -> s.startsWith("小")).forEach(System.out::println);

        System.out.println("------------------");


        //需求2:把List集合中长度为3的元素在控制台输出
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);

        System.out.println("------------------");


        //需求3:把List集合中以'小'开头的,长度为3的元素在控制台输出
        list.stream().filter(s -> s.startsWith("小")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
