package jn.demo10;

import java.util.*;

/**
 * @Author WTIHK
 * @Date 2021/1/6
 */

/*
    线程安全的类:
        StringBuffer
        Vector
        Hashtable
 */

public class ThreadDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();
        ArrayList<String> array = new ArrayList<String>();

        Hashtable<String, String> st = new Hashtable<String, String>();
        HashMap<String, String> map = new HashMap<String, String>();

        //static <T> List<T> synchronizedList(List<T> list) 返回由指定列表支持的同步（线程安全）列表。
        List<String> list =  Collections.synchronizedList(new ArrayList<String>());

        //static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) 返回由指定地图支持的同步（线程安全）映射。

        //static <T> Collection<T> synchronizedCollection(Collection<T> c) 返回由指定集合支持的同步（线程安全）集合。

    }
}
