package an.demo01;

import java.util.ArrayList;

/**
 * @Author WTIHK
 * @Date 2021/2/22
 */

/*
    需求：按照下面的要求完成集合的创建和遍历
        创建一个集合，存储多个字符串元素
        把集合中所有以 ”小“ 开头的元素存储到一个新的集合
        把 ”小“ 开头的集合中的长度为3的元素存储到一个新的集合
        遍历上一步得到的集合
 */

public class StreamDemo {
    public static void main(String[] args) {

        //创建一个集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("大雄");
        list.add("小静香");
        list.add("小胖虎");
        list.add("小夫");
        list.add("哆啦A梦");

        //把集合中所有以 ”小“ 开头的元素存储到一个新的集合
        ArrayList<String> xiaoList = new ArrayList<String>();

        for (String s : list) {
            if (s.startsWith("小")) {
                xiaoList.add(s);
            }
        }

//        System.out.println(xiaolist);

        //把 ”小“ 开头的集合中的长度为3的元素存储到一个新的集合

        ArrayList<String> threeList = new ArrayList<String>();

        for (String s : xiaoList) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }

//        System.out.println(threeList);

        //遍历上一步得到的集合
        for (String s : threeList) {
            System.out.println(s);
        }

        System.out.println("------------------");

        //Stream流来改写
//        list.stream().filter(s -> s.startsWith("小")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        list.stream().filter(s -> s.startsWith("小")).filter(s -> s.length() == 3).forEach(System.out::println);



    }
}
