package fn.demo06;

import java.util.*;

/**
 * @Author WTIHK
 * @Date 2020/12/23
 */

/*
    需求:
        键盘录入一个字符串,要求统计字符串中每个字符串出现的次数
        举例:键盘录入"aababcabcdabcde" 在控制台输出: "a(5)b(4)c(3)d(2)e(1)"

    分析:
        1.可以把结果看分成几个部分来看: a(5),b(4),c(3),d(2),e(1)
        2.每一个部分可以看成是: 字符和字符对应的次数组成
        3.这样的数据,可以通过HashMap集合来存储,键是字符,值是字符出现的次数
            注意:
            键是字符,类型应该是Character; 值是字符出现的次数,类型应该是Integer

    思路:
        1.键盘录入一个字符串
        2.创建HashMap集合,键是Character, 值是Integer
        3.遍历字符串,得到每一个字符
        4.拿到的每一个字符串作为键到HashMap集合中去对应的值,看其返回值
            如果返回值是null: 说明该字符在HashMap集合中不存在,就把该字符作为键,1作为值存储
            如果返回值不是null: 说明该字符在HashMap集合中存在,就把该值加1,然后重新存储字符和对应的值
        5.遍历HashMap集合,得到键和值,按照要求进行拼接
        6.输出结果
 */

public class HashMapDemo {
    public static void main(String[] args) {

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();


        //2.创建HashMap集合,键是Character, 值是Integer
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //HashMap集合输出结果之序,下面使用TreeMap
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();


        //3.遍历字符串,得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            //4.拿到的每一个字符串作为键到HashMap集合中去对应的值,看其返回值
            Integer value = map.get(key);

            if (value == null) {
                //如果返回值是null: 说明该字符在HashMap集合中不存在,就把该字符作为键,1作为值存储
                map.put(key, 1);
            } else {
                //如果返回值不是null: 说明该字符在HashMap集合中存在,就把该值加1,然后重新存储字符和对应的值
                value++;
                map.put(key, value);
            }
        }

        //5.遍历HashMap集合,得到键和值,按照要求进行拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            Integer value = map.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();

        //6.输出结果
        System.out.println(result);

    }
}
