package bn.demo02;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author WTIHK
 * @Date 2020/12/23
 */

/*
    转换为 `Map集合` 中的操作
        - 获取所有键的集合。用 `keySet()` 方法实现
        - 遍历键的集合，获取到每一个键。用增强 for 实现
        - 根据键去找值。用 `get(Object key)` 方法实现
 */

public class MapDemo01 {
    public static void main(String[] args) {

        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("大雄", "静香");
        map.put("胖虎", "小夫");
        map.put("熊大", "熊二");

        //1- 获取所有键的集合。用 `keySet()` 方法实现
        Set<String > keySet = map.keySet();

        //2- 遍历键的集合，获取到每一个键。用增强 for 实现
        for (String key : keySet) {
            //3- 根据键去找值。用 `get(Object key)` 方法实现
            String value =  map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
