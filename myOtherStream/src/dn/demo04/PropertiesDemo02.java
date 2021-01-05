package dn.demo04;

import java.util.Properties;
import java.util.Set;

/**
 * @Author WTIHK
 * @Date 2020/12/30
 */

/*
    Properties 作为集合的特有方法：
      Object setProperty(String key, String value)	设置集合的键和值，都是 String 类型，底层调用 Hashtable 方法 put
      String getProperty(String key) 使用此属性列表中指定的键搜索属性
      Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串

 */

public class PropertiesDemo02 {
    public static void main(String[] args) {

        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key, String value)	设置集合的键和值，都是 String 类型，底层调用 Hashtable 方法 put
        prop.setProperty("Hk123", "大雄");

        /*
        Object setProperty(String key, String value) {
            return put(key, value);
        }

        Object put(Object key, Object value) {
            return map.put(key, value);
        }
         */

        prop.setProperty("Hk125", "静香");
        prop.setProperty("Hk127", "胖虎");


        //String getProperty(String key) 使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("Hk123"));
        System.out.println(prop.getProperty("Hk128"));//键不存在返回null

        System.out.println("---------------------");



        System.out.println(prop);


        System.out.println("---------------------");


        //Set<String> stringPropertyNames() 从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();

        for (String key : names) {
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }



    }
}
