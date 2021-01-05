package dn.demo04;

import java.util.Properties;
import java.util.Set;

/**
 * @Author WTIHK
 * @Date 2020/12/30
 */

/*
    Properties作为Map集合的使用
 */

public class PropertiesDemo01 {
    public static void main(String[] args) {

        //创建集合对象
//        Properties<String, String> prop = new Properties<String, String>(); //不是泛型类,不能写泛型
        Properties prop = new Properties();

        //存储元素
        prop.put("Hk123", "大雄");
        prop.put("Hk125", "静香");
        prop.put("Hk127", "胖虎");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }
}
