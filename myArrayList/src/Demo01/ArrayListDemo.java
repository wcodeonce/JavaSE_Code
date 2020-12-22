package Demo01;

import java.util.ArrayList;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    ArrayList构造方法：
        public ArrayList ( )创建一个空的集合对象

    ArrayList添加方法：
        public boolean add ( E e )将指定的元素追加到此合集的末尾
        public void add ( int index, E element )在此合集中的指定位置插入指定的元素
*/

public class ArrayListDemo {
    public static void main(String[] args) {
        //public ArrayList ( )创建一个空的集合对象
        //ArrayList<String> array = new ArrayList<>();

        ArrayList<String> array = new ArrayList<String>();

        //public boolean add ( E e )将指定的元素追加到此合集的末尾
//        System.out.println(array.add("Hello"));
        array.add("Hello");
        array.add("World");
        array.add("Java");

        //public void add ( int index, E element )在此合集中的指定位置插入指定的元素
        array.add(1, "JavaSE");
//        array.add(3, "JavaSE");

        //IndexOutOfBoundsException -- 集合索引越界
//        array.add(4, "JavaEE");

        //输出集合
        System.out.println("array: " + array);
    }
}
