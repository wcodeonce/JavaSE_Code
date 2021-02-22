package dn.demo04;

import java.util.ArrayList;

/**
 * @Author WTIHK
 * @Date 2021/2/23
 */

/*
    Stream 流的常见终结操作方法
        void forEach(Consumer action)：对此流的每个元素执行操作
  	        Consumer接口中的方法			void accept(T t)：对给定的参数执行此操作
        long count()：返回此流中的元素数
 */

public class StreamDemo {
    public static void main(String[] args) {

        //创建一个数组集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("大雄");
        list.add("静香");
        list.add("胖虎");
        list.add("小夫");
        list.add("哆啦A梦");

        //需求1:把集合中的元素在控制台输出
        list.stream().forEach(System.out::println);

        //需求2:统计集合中由集合以'张'开头的元素,并把统计结果在控制台输出
        long count = list.stream().filter(s -> s.startsWith("小")).count();
        System.out.println(count);

    }
}
