package en.demo05;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HTH
 * @Date 2020/12/19
 */

/*
    增强 for：简化数组和 `Collection`集合的遍历

        - 实现 `Iterable` 接口的类允许其对象称为增强型 `for` 语句的目标
        - 它是 JDK5 之后出现的，其内部原理时一个 `Iterator` 迭代器

    格式：
    	//Java增强for的格式
	    for(元素数据类型 变量名：数组或者Collection集合) {
            //在此处使用变量即可，该变量就是元素
        }
 */

public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("----------------");

        String[] strArray = {"Hello", "World", "JavaSE"};
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("----------------");

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");

        for (String s : list) {
            System.out.println(s);
        }

        /*
        System.out.println("------------------");
        //内部原理是一个Iterator迭代器
        for (String s : list) {
            if (s.equals("World")) {
                list.add("JavaEE");
            }
        }
        //ConcurrentModificationException
        //抛出并发修改异常
         */

    }
}
