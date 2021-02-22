package cn.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author WTIHK
 * @Date 2021/2/1
 */

/*
    需求：
        定义一个类（ComparatorDemo），在类中提供两个方法
            一个方法是：Comparator<String>getComparator() 方法返回值 Comparator 是一个函数式接口
            一个是主方法，在主方法中调用 getComparator 方法
 */

public class ComparatorDemo {
    public static void main(String[] args) {

        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<>();

        array.add("ccc");
        array.add("a");
        array.add("bb");
        array.add("dddd");

        System.out.println("排序前：" + array);

        //Collections.sort(array);
        Collections.sort(array, getComparator());

        System.out.println("排序后：" + array);

    }

    private static Comparator<String> getComparator() {
        //使用匿名内部类的方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return comp;

//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

//        return (String s1, String s2) -> {
//            return s1.length() - s2.length();
//        };

        return (s1,s2) -> s1.length() - s2.length();

    }

}
