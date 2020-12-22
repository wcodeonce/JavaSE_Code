package an.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    Map 集合概述和使用
        - Interface Map<K, V>		K: 键的类型；V: 值的类型；
        - 将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值

    创建 `Map` 集合的对象
        - 多态的方式
        - 具体的实现类 `HashMap`
 */

public class MapDemo01 {
    public static void main(String[] args) {

        //创建集合对象
        Map<String,String> map = new HashMap<String, String>();
        //Hash保证Map集合的唯一性

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("K123", "大雄");
        map.put("K133", "静香");
        map.put("K143", "胖虎");
        //使用put方法,键第一次出现是添加元素,键第二次出现是修改元素
        map.put("K143", "小夫");

        //输出集合对象
        System.out.println(map);

    }
}
