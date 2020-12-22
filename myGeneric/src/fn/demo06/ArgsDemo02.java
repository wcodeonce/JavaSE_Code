package fn.demo06;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
    Arrays 工具类中有一个静态方法：
        public static<T> List<T> asList(T...a):返回有指定数组支持的固定大小列表

    List 接口中有一个静态方法：
        public static <E> List<E> of(E...elements):返回包含任意数量元素的不可变列表

    Set 接口中有一个静态方法：
        public static<E> Set<E> of(E...elements):返回一个包含任意数量元素的不可变集合
 */

public class ArgsDemo02 {
    public static void main(String[] args) {

        //public static<T> List<T> asList(T...a):返回有指定数组支持的固定大小列表
        List<String> list = Arrays.asList("Hello", "World", "Java");

//        list.add("JavaSE");  //UnsupportedOperationException:不支持请求的操作
//        list.remove("Java");  //UnsupportedOperationException:不支持请求的操作
        list.set(2, "JavaSE");

        System.out.println(list);
        System.out.println("---------------------------------");


        //public static <E> List<E> of(E...elements):返回包含任意数量元素的不可变列表
        List<String> list2 = List.of("Hello", "World", "JavaSE", "World");

//        list2.add("JavaSE");  //UnsupportedOperationException:不支持请求的操作
//        list2.remove("JavaSE");  //UnsupportedOperationException:不支持请求的操作
//        list2.set(2, "JavaEE");  //UnsupportedOperationException:不支持请求的操作

        System.out.println(list2);
        System.out.println("---------------------------------");


        //public static<E> Set<E> of(E...elements):返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("Hello", "World", "JavaSE", "World");  //IllegalArgumentException
        Set<String> set = Set.of("Hello", "World", "JavaSE");

//        set.add("JavaEE");  //UnsupportedOperationException:不支持请求的操作
//        set.remove("JavaSE");  //UnsupportedOperationException:不支持请求的操作
        //Set没有索引,不能做索引增删方法

        System.out.println(set);

    }
}
