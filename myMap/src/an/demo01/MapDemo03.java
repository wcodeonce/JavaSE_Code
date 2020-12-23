package an.demo01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    Map 集合的获取功能
        | 方法名                                  | 说明                          |
        | -------------------------------------- | ---------------------------- |
        | V get ( Object key )                   | 根据键获取值                    |
        | Set <'K'> keySet ( )                   | 获取所有键的集合                |
        | Collection <'V'> values ( )            | 获取所有值的集合                |
        | Set <Map.Entry<K, V>> entrySet ( )     | 获取所有键值对对象的集合          |
 */

public class MapDemo03 {
    public static void main(String[] args) {

        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("大雄", "静香");
        map.put("胖虎", "小夫");
        map.put("路飞", "索隆");

        //V get ( Object key )根据键获取值
        System.out.println(map.get("大雄"));
        System.out.println(map.get("大熊"));
        System.out.println("--------------------------------");

        //Set <'K'> keySet ( )获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }
        System.out.println("--------------------------------");


        //Collection <'V'> values ( )获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("--------------------------------");


        //Set <Map.Entry<K, V>> entrySet ( )获取所有键值对对象的集合



    }
}
