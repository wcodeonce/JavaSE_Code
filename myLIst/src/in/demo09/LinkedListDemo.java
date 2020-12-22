package in.demo09;

import java.util.LinkedList;

/**
 * @Author HTH
 * @Date 2020/12/20
 */

/*
    LinkedList 集合的特意功能

        | 方法名                        | 说明
        | ---------------------------- | --------------------------------
        | public void addFirst ( E e ) | 该列表开头插入指定的元素
        | public void addLast ( E e )  | 将指定的元素追加到此列表的末尾
        | public E getFirst ( )        | 返回此列表中的第一个元素
        | public E getLast ( )         | 返回此列表中的最后一个元素
        | public E removeFirst ( )     | 从此列表中删除并返回第一个元素
        | public E removeLast ( )      | 从此列表中删除并返回最后一个元素
 */

public class LinkedListDemo {
    public static void main(String[] args) {

        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        //输出集合
        System.out.println(linkedList);
        System.out.println("-----------------------------");

        //public void addFirst ( E e ) | 该列表开头插入指定的元素
        //public void addLast ( E e )  | 将指定的元素追加到此列表的末尾
        linkedList.addFirst("JavaSE");
        linkedList.addLast("JavaEE");
        //输出集合
        System.out.println(linkedList);
        System.out.println("-----------------------------");

        //public E getFirst ( )        | 返回此列表中的第一个元素
        //public E getLast ( )         | 返回此列表中的最后一个元素
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        //输出集合
        System.out.println(linkedList);
        System.out.println("-----------------------------");

        //public E removeFirst ( )     | 从此列表中删除并返回第一个元素
        //public E removeLast ( )      | 从此列表中删除并返回最后一个元素
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        //输出集合
        System.out.println(linkedList);
        System.out.println("-----------------------------");

    }
}
