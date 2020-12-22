package an.demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author HTH
 * @Date 2020/12/20
 */

/*
    Set集合特点：
        不包含重复元素的集合
        没有带索引的方法，所以不能使用普通for循环遍历

    HashSet: 对集合的迭代顺序不做任何保证
 */

public class SetDemo {
    public static void main(String[] args) {

        //创建Set集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("Hello");
        set.add("World");
        set.add("JavaSE");
        //不包含重复元素
//        set.add("JavaSE");

        //输出集合
        System.out.println(set);

        //增强for遍历集合
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("-----------------------");

        //迭代器遍历集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------------");

        //普通for遍历集合
        for (int i = 0; i < set.size(); i++) {


        }


    }
}
