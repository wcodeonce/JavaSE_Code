package fn.demo07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author HTH
 * @Date 2020/12/20
 */

/*
    List集合常用子类: ArrayList**, LinkedList
        ArrayList：底层数据结构是数组，查询快，增删慢
        LinkedList：地城数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */

public class ListDemo {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();

        //添加集合元素
        array.add("Hello");
        array.add("World");
        array.add("JavaSE");

        //增强for遍历
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        //迭代器遍历
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------");

        //普通遍历
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------");

        //创建LinkedList集合对象
        LinkedList<String> linkedList = new LinkedList<String>();

        //添加集合元素
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("JavaSE");

        //增强for遍历
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        //迭代器遍历
        Iterator<String> its = linkedList.iterator();
        while (its.hasNext()) {
            String s = its.next();
            System.out.println(s);
        }
        System.out.println("---------------------");

        //普通遍历
        for (int i = 0; i < linkedList.size(); i++) {
            String s = linkedList.get(i);
            System.out.println(s);
        }

    }
}
