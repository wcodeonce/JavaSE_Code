package en.demo05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author WTIHK
 * @Date 2020/12/23
 */

/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历

    思路：
        1.创建ArrayList集合
        2.创建HashMap集合，并添加键值对元素
        3.把HashMap作为元素添加到ArrayList集合
        4.遍历ArrayList集合

    给出如下的数据：
        第一个HashMap集合的元素：
            孙策  大乔
            周瑜  小乔
        第二个HashMap集合的元素：
            大雄  静香
            胖虎  小夫
        第一个HashMap集合的元素：
            熊大  熊二
            吉吉  毛毛
 */

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {

        //创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        //创建HashMap集合，并添加键值对元素
        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("孙策", "大乔");
        map1.put("周瑜", "小乔");

        HashMap<String, String> map2 = new HashMap<String, String>();
        map2.put("大雄", "静香");
        map2.put("胖虎", "小夫");

        HashMap<String, String> map3 = new HashMap<String, String>();
        map3.put("熊大", "熊二");
        map3.put("吉吉", "毛毛");

        //把HashMap作为元素添加到ArrayList集合
        array.add(map1);
        array.add(map2);
        array.add(map3);

        //遍历ArrayList集合
        for (HashMap<String, String> map : array) {
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                String value = map.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}
