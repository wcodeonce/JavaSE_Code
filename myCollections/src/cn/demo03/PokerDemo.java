package cn.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Author WTIHK
 * @Date 2020/12/24
 */

/*
    需求:
        通过程序实现斗地主过程中的洗牌，发牌和看牌。
        要求：对牌进行排序

    思路：
        1.创建HashMap，键是编号，值是牌
        2.创建ArrayList，存储编号
        3.创建花色数组和点数数组
        4.从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5.洗牌（洗的是编号，用Collections的shuffle()方法实现
        6.发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        7.定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
        8.调用看牌方法
 */

public class PokerDemo {
    public static void main(String[] args) {

        //创建HashMap，键是编号，值是牌
        HashMap<Integer, String> map = new HashMap<Integer, String>();


        //创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();


        //创建花色数组和点数数组
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};


        //从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                map.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        map.put(index, "小王");
        array.add(index);
        index++;
        map.put(index, "大王");
        array.add(index);


        //洗牌（洗的是编号，用Collections的shuffle()方法实现
        Collections.shuffle(array);


        //发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        TreeSet<Integer> User_1 = new TreeSet<Integer>();
        TreeSet<Integer> User_2 = new TreeSet<Integer>();
        TreeSet<Integer> User_3 = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(array.get(x));
            } else if (i % 3 == 0) {
                User_1.add(x);
            } else if (i % 3 == 1) {
                User_2.add(x);
            } else if (i % 3 == 2) {
                User_3.add(x);
            }
        }

        //调用看牌方法
        lookPoker("大雄", User_1, map);
        lookPoker("静香", User_2, map);
        lookPoker("胖虎", User_3, map);
        lookPoker("底牌", dpSet, map);

    }

    //定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> map) {
        System.out.print(name + "的牌是:");
        for (Integer key : ts) {
            String poker = map.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
