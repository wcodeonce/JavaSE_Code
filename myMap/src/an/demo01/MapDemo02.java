package an.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    Map 集合的基本功能
        | 方法名                                   | 说明                                 |
        | --------------------------------------- | ------------------------------------ |
        | V put ( K key, V value )                | 添加元素                             |
        | V remove ( Object key )                 | 根据键删除键值对元素                 |
        | void clear ( )                          | 移除所有的键值对元素                 |
        | boolean containsKey ( Object key )      | 判断集合是否包含指定的键             |
        | boolean contains Value ( Object value ) | 判断集合是否包含指定的值             |
        | boolean isEmpty ( )                     | 判断集合是否为空                     |
        | int size ( )                            | 集合的长度，也就是集合中键值对的个数 |
 */

public class MapDemo02 {
    public static void main(String[] args) {

        //创建Map集合对象
        Map<String, String> map = new HashMap<String, String>();

        // V put ( K key, V value )添加元素
        map.put("路飞", "索隆");
        map.put("大雄", "静香");
        map.put("娜美", "罗宾");
        map.put("熊大", "熊二");

        // V remove ( Object key )根据键删除键值对元素
        System.out.println(map.remove("大雄"));
        System.out.println(map.remove("大熊")); //没有对应的键,返回null


        // boolean containsKey ( Object key )判断集合是否包含指定的键
        System.out.println(map.containsKey("熊大"));
        System.out.println(map.containsKey("大熊"));


        // boolean contains Value ( Object value )判断集合是否包含指定的值
        System.out.println(map.containsValue("熊二"));
        System.out.println(map.containsValue("熊三"));


        // boolean isEmpty ( ) 判断集合是否为空
        System.out.println(map.isEmpty());


        // int size ( )集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());


        //输出集合对象
        System.out.println(map);


        // void clear ( )移除所有的键值对元素
        map.clear();

        //输出集合对象
        System.out.println(map);


    }
}
