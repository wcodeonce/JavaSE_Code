package dn.demo04;

import java.util.LinkedHashSet;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    LinkedHashSet集合特点
        1- 哈希表和链表实现的 `Set` 接口,具有可预测的迭代次序
        2- 由链表保证元素有序,也就是说元素的存储和取出顺序是一致的
        3- 由哈希表保证元素唯一,也就是说没有重复的元素
 */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> array = new LinkedHashSet<String>();

        //添加元素
        array.add("Hello");
        array.add("World");
        array.add("JavaSE");

        //由哈希表保证元素唯一,也就是说没有重复的元素
        array.add("World");

        System.out.println(array);
        System.out.println("----------------------");

        //遍历集合(增强for)
        for (String s : array) {
            System.out.println(s);
        }

    }
}
