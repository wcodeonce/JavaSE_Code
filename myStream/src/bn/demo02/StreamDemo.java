package bn.demo02;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author WTIHK
 * @Date 2021/2/22
 */

/*
    Stream 流的常见生成方式
        1.Collection体系的集合可以使用默认方法stream()生成流
            default Stream<E> stream()
        2.Map体系的集合间接生成流
        3.数组可以通过Stream接口的静态方法of(T...values)生成流
 */

public class StreamDemo {
    public static void main(String[] args) {

        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();


        //Map体系的集合间接生成流
        Map<String, Integer> map = new HashMap<String, Integer>();
        //键对应的流
        Stream<String> keyStream = map.keySet().stream();
        //值对应的流
        Stream<Integer> valueStream = map.values().stream();
        //键值对对象对应的流
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();


        //数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArray = {"Hello", "World", "Java"};
        Stream<String> strArrayStream = Stream.of(strArray);

        Stream<String> strArrayStream2 = Stream.of("Hello", "World", "Java");

        Stream<Integer> intStream = Stream.of(10, 20, 30);

    }
}
