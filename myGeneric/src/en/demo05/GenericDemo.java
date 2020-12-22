package en.demo05;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HTH
 * @Date 2020/12/22
 */

/*
        - 类型通配符：<?>
        - List<?>：表示元素类型位置的 `List` 的父类，并不能把元素添加到其中
        -
        如果不希望 `List<?>` 是任何泛型 `List` 的父类，只希望它代表某一类泛型 `List` 的父类，可以使用类型通配符的上限
        - 类型通配符的上限：<? extends 类型>
        - List<? extends Number> ：他表示的类型是 Number或者其子类型
        -
        除了可以指定类型通配符的上限，也可以指定类型统配符的下限
        - 类型通配符下限：<? super 类型>
        - List<? super Number>：他表示的类型是 Number或者其父类型
 */

public class GenericDemo {
    public static void main(String[] args) {

        //类型通配符：<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("--------------------------------");

        //类型通配符的上限：<? extends 类型>
//        List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("--------------------------------");

        //类型通配符下限：<? super 类型>
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
//        List<? super Number> list9 = new ArrayList<Integer>();

    }
}
