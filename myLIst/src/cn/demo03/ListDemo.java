package cn.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HTH
 * @Date 2020/12/18
 */

/*
    需求:
        我有一个集合: List<String> list = new ArrayList<String>();
        里面有三个元素: List.add("Hello"); list.add("World"); List.add("JavaSE");
        遍历集合,得到每一个元素,看有没有"word"这个元素,如果有我就添加一个"JavaEE"元素,请写代码实现
 */

    /*
    ConcurrentModificationException: 当不允许这样的修改时，检测到对象的并发修改的方法可能抛出此异常
    */

public class ListDemo {
    public static void main(String[] args) {

        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");

        //遍历集合,得到每一个元素,看有没有"word"这个元素,如果有我就添加一个"JavaEE"元素,请写代码实现
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if (s.equals("World")) {
//                list.add("JavaEE");
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("World")) {
                list.add("JavaEE");
            }
        }


        System.out.println(list);
    }
}
