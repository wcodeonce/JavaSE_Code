package an.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HTH
 * @Date 2020/12/18
 */

/*
    List集合特有方法:
        void add ( index, E element )再次集合中的指定位置插入指定的元素
        E remove ( int index )删除指定索引出的元素,返回被删除的元素
        E set ( int index, E element )修改指定索引出的元素,返回被修改的元素
        E get ( int index )返回指定索引出的元素
 */

public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("Java");


        //void add ( index, E element )在此集合中的指定位置插入指定的元素
        list.add(1, "JavaEE");
//        list.add(11, "JavaSE"); --IndexOutOfBoundsException索引越界异常

        //E remove ( int index )删除指定索引出的元素,返回被删除的元素
        System.out.println(list.remove(1));
//        System.out.println(list.remove(11)); --IndexOutOfBoundsException索引越界异常

        //E set ( int index, E element )修改指定索引出的元素,返回被修改的元素
        System.out.println(list.set(2, "JavaEE"));
//        System.out.println(list.set(12, "JavaEE")); --IndexOutOfBoundsException索引越界异常

        //E get ( int index )返回指定索引出的元素
        System.out.println(list.get(1));
//        System.out.println(list.get(11)); --IndexOutOfBoundsException索引越界异常

        //输出集合对象
//        System.out.println(list);

        System.out.println("--------------------");

        /*
        //遍历集合
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
         */

        //用for循环改进遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
