package dn.demo04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author HTH
 * @Date 2020/12/18
 */

/*
    **Listlterator: 列表迭代器**

- 通过List集合的 **listlterator ( )** 方法得到，所以说它是List集合特有的迭代器
- 用于允许程序员沿任一方向遍历列表的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置

    **Listlterator 中的常用方法**

- E next ( ) : 返回迭代中的下一个元素
- boolean hasNex ( ) : 如果迭代具有更多元素，则返回 `true`
- E previous ( ) : 返回列表中的上一个元素
- boolean hasPrevious ( ) : 如果值列表迭代器在相反方法学遍历列表时具有更多元素，则返回 `true`
- void add ( E e ) : 将指定的元素插入列表
 */

public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");

        //通过List集合的listIterator()方法得到
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("----------------------------");
//
//        while (lit.hasPrevious()) {
//            String s = lit.previous();
//            System.out.println(s);
//        }
//        System.out.println("----------------------------");

        //获取列表迭代器
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if (s.equals("World")) {
                lit.add("JavaEE");
            }
        }

        System.out.println(list);


    }
}
