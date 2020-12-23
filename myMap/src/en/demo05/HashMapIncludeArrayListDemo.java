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
        创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键时String，值时ArrayList，
        每一个ArrayList的元素是String，并遍历

    思路：
        1.创建HashMap集合
        2.创建ArrayList集合，并添加元素
        3.把ArrayList作为元素添加到HashMap集合
        4.遍历HashMap集合

    给出如下的数据：
        第一个ArrayList集合的元素：（三国演义）
            诸葛亮
            赵云
        第一个ArrayList集合的元素：（西游记）
            唐僧
            孙悟空
        第三个ArrayList集合的元素：（水浒传）
            武松
            鲁智深

 */

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {

        //创建HashMap集合
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();


        //创建ArrayList集合，并添加元素
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("诸葛亮");
        arrayList1.add("赵云");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("唐僧");
        arrayList2.add("孙悟空");

        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("武松");
        arrayList3.add("鲁智深");



        //把ArrayList作为元素添加到HashMap集合
        map.put("三国演义", arrayList1);
        map.put("西游记", arrayList2);
        map.put("水浒传", arrayList3);


        //遍历HashMap集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = map.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
