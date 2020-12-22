package Demo02;

import java.util.ArrayList;

/**
 * @Author/ junjie
 * @Description/ //TODO $
 * @Date/ $ $
 * @Param/ $
 * @return/ $
 */

/*
    public boolean remove ( Object o )删除指定的元素, 返回删除是否成功
    public E remove ( int index )删除指定索引处的处的元素, 返回被删除的元素
    public E set ( index, E element )修改指定索引处的元素, 返回被修改的元素
    public E get ( int index)返回指定索引处的元素
    public int size ( )返回集合中的元素的个数
*/

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //public ArrayList ( )创建一个空的集合对象
        //ArrayList<String> array = new ArrayList<>();

        ArrayList<String> array = new ArrayList<String>();

        //public boolean add ( E e )将指定的元素追加到此合集的末尾
//        System.out.println(array.add("Hello"));
        array.add("Hello");
        array.add("World");
        array.add("Java");

        //public boolean remove ( Object o )删除指定的元素, 返回删除是否成功
//        System.out.println(array.remove("World"));

        //返回false 集合中无此元素
//        System.out.println(array.remove("JavaEE"));

        //public E remove ( int index )删除指定索引处的处的元素, 返回被删除的元素
//        System.out.println(array.remove(1));

        //IndexOutOfBoundsException -- 集合元素删除索引越界
//        System.out.println(array.remove(3));

        //public E set ( index, E element )修改指定索引处的元素, 返回被修改的元素
//        System.out.println(array.set(1, "JavaEE"));

        //IndexOutOfBoundsException -- 集合元素修改索引越界
//        System.out.println(array.set(3, "JavaSE"));

        //public E get ( int index)返回指定索引处的元素
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));

        //IndexOutOfBoundsException -- 集合元素返回索引越界
//        System.out.println(array.get(3));

        //public int size ( )返回集合中的元素的个数
        System.out.println(array.size());


        //输出集合
        System.out.println("array: " + array);





    }
}
