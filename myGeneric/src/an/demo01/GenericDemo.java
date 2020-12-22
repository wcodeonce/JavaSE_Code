package an.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author HTH
 * @Date 2020/12/21
 */

/*
    需求:
    Collection集合存储字符串并遍历
 */

public class GenericDemo {
    public static void main(String[] args) {

        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();
        //创建集合时就限定了只可以存储String类型的数据

        //添加元素
        c.add("Hello");
        c.add("World");
        c.add("JavaSE");
//        c.add(100);

        //遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//            String s = (String)it.next();  //ClassCastException
            //添加泛型以后程序不需要再加强制类型转换
            String s = it.next();
            System.out.println(s);
        }

    }
}
