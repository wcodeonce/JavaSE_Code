package cn.demo03;

import java.util.HashSet;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    HashSet集合特点
        1- 底层数据结构是哈希表
        2- 对集合的迭代顺序不做任何保证,也就是说不保证存储和取出元素顺序一致
        3- 没有带索引的方法,所以不能使用普通`for`循环遍历
        4- 由于是 `Set`集合,我已不包含重复元素的集合
 */

public class HashSetDemo {
    public static void main(String[] args) {

        //创建集合对象
        HashSet<String> hs = new HashSet<String>();

        //添加集合元素
        hs.add("Hello");
        hs.add("World");
        hs.add("JavaSE");
        //由于是 `Set`集合,我已不包含重复元素的集合
        hs.add("World");

        //增强for遍历集合
        for (String s : hs) {
            System.out.println(s);
        }
        //不保证存储和取出元素顺序一致

        //输出集合
        System.out.println(hs);

    }
}
