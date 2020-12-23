package bn.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author WTIHK
 * @Date 2020/12/23
 */

/*
      - 获取所有的键值对对象的集合
        - Set<Map.Entry<K, V>> entrySet ( ) : 获取所有键值对对象的集合

        - 遍历键值对对象的集合，得到每一个键值对对象
      - 用增强 for 实现，得到每一个 `Map.Entry`

      - 根据键值对对象获取键和值
        - 用 `getKey()` 得到键
        - 用 `getValue()` 得到值
 */

public class MapDemo02 {
    public static void main(String[] args) {

        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("大雄", "静香");
        map.put("胖虎", "小夫");
        map.put("熊大", "熊二");


    }
}
