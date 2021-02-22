package dn.demo04;

import java.util.function.Supplier;

/**
 * @Author WTIHK
 * @Date 2021/2/2
 */

/*
    Supplier<T> ：包含一个无参的方法
        T get()：获得结果
            该方法不需要参数，他会安装某种实现逻辑（有Lambda表达式实现）返回一个数据
            Supplier<T>：接口也称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会产生什么类型的数据供我们使用
 */

public class SupplierDemo {
    public static void main(String[] args) {

        //调用getString方法
//        String s = getString(() -> {
//            return "大雄";
//        });

        String s = getString(() -> "胖虎");

        System.out.println(s);

        Integer i = getInteger(() -> 20);

        System.out.println(i);

    }

    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> sup) {
        return sup.get();
    }

    //定义一个方法，返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }


}
